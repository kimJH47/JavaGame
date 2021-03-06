package com.javaproject.server;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;

import com.javaproject.protocol.ChatData;
import com.javaproject.protocol.JoinData;
import com.javaproject.protocol.Protocol;
public class Room {

    Set<ClientHandler> clientList = new HashSet<>();
    private int num = 0;
    private int roomNum = 0;

    public Room(int roomNum,Queue<ClientHandler> clientsList) {
        JoinData joinData = new JoinData(JoinData.JOIN_ROOM);
        joinData.setMessage(String.format("%d", roomNum));
        int user_num = 1;
        for (Iterator<ClientHandler> iterator = clientsList.iterator(); iterator.hasNext();) {
            joinData.setName(Integer.toString(user_num));
            ClientHandler client =iterator.next();
            this.clientList.add(client);
            client.enterRoom(this);
            this.roomNum = roomNum;
            user_num++;
            client.sendData(joinData);
        }
        System.out.println(roomNum+" Room created !");


    }
    public void broadcasting(Protocol data){
        if(data instanceof ChatData) {
            for(Iterator<ClientHandler> iter = clientList.iterator();iter.hasNext();) {
                ClientHandler client = iter.next();
                client.sendData(data);
            }
        }

    }

    public int getRoomNum() {
        return roomNum;

    }
}

