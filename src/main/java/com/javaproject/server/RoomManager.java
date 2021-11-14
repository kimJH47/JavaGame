package main.java.com.javaproject.server;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import main.java.com.javaproject.protocol.*;

public class RoomManager {

    Queue<ClientHandler> clientList = new LinkedList<>();
    Set<Room> roomList = new HashSet<>();
    private int room_number = 0;
    static int users = 0;


    public RoomManager() {
        System.out.println("RoomManager created");

    }
    public void broadcasting() {
    }

    public void searchRoom(int roomNum, Protocol data) {
        for(Iterator<Room> iter = roomList.iterator();iter.hasNext();) {
            Room room = iter.next();
            if(room.getRoomNum()==roomNum) {
                room.broadcasting(data);
            }

        }


    }

    synchronized public void addClient(ClientHandler client) {

        this.clientList.offer(client);
        System.out.println("(RM)add client!: " + client.getName() + client.socket.getInetAddress());
        users++;
        if (users % 2 == 0)
            createRoom(clientList);
    }
    synchronized public void createRoom(Queue<ClientHandler> clientList) {
        roomList.add(new Room(room_number++, clientList));

    }
}