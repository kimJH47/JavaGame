package com.javaproject.server;

import java.util.*;

import com.javaproject.protocol.Protocol;

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