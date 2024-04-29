package com.exam.day07.caht.server;

import java.io.IOException;

public class ChatHandler extends Thread{
    private ClientManager clientManager;
    private ChatRoomManager chatRoomManager;
    private Client client;

    private ChatRoom chatRoom; //null 인 경우는 아직 대화방에 참여하지 않은 상태.  Lobby 에 있는 경우.


    ChatHandler(ClientManager clientManager, ChatRoomManager chatRoomManager, Client client){
        this.chatRoomManager = chatRoomManager;
        this.client = client;
        this.clientManager = clientManager;
    }

    @Override
    public void run() {
        while (true){
            try {
                String message = client.getIn().readLine();
                if(message == null){
                    System.out.println(client.getNickname() + "닉네임 사용자가 연결을 끊었습니다.");
                    client.close();
                    return;
                }

                if(message.indexOf("/") == 0){  //0번 인덱스의 문자열이 "/" 라면...  /로 시작하면 특별한 명령이라고 약속..
                    if("/list".equals(message)){
                        //채팅룸 리스트를 보여주면..
                    }

                }else{
                    //대화 입력이 들어왔을때.
                    //지정된 채팅룸이 없을 때 대화 할  수 없었다.
                    if(chatRoom != null){
                        //대화방에 입장한 상태.
                        //정해진 대화방에 들어간 모든 사용자에게 메시지 전달.
                    }else{
                        System.out.println("채팅룸안에 있지 않아요!!");
                        client.getOut().println("채팅룸안에 없으므로 대화 할 수 없어요!!");
                    }

                }
            }catch (IOException e){
                e.printStackTrace();
                client.close();
            }
        }

    }
}
