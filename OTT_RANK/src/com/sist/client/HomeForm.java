package com.sist.client;
import javax.swing.*;
import java.awt.*;

public class HomeForm extends JPanel{

       // 검색 입력하는 필드
	JTextField SearchFd;
       // 검색 버튼
	JButton SearchBtn;

	public HomeForm(){

              setLayout(null);// 좌표로 위치를 잡기 위해 null

              SearchFd = new JTextField(); // 검색 입력 필드 생성
              SearchBtn = new JButton("검색"); // 검색 버튼에 '검색' 이라고 표시
              
              JPanel p = new JPanel(); // 검색 입력 필드와 검색 버튼을 담을 패널 생성

              p.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
              // p.setLayout은 
              // 패널의 배치를 FlowLayout로 설정 => 가로로 배치한다고 생각하면 됨 
              // FlowLayout.center은 가운데로 정렬
              
              SearchFd.setPreferredSize(new Dimension(800, 35)); //검색 입력 필드 크기 설정 800은 가로, 35는 세로
              SearchBtn.setPreferredSize(new Dimension(90, 35)); //검색 버튼 크기 설정 90은 가로, 35는 세로
              
              p.add(SearchFd); // 위에서 패널을 생성하고 패널들의 크기를 정했으면 이제 패널에 추가하기
              p.add(SearchBtn); // 이하 동문
              
              p.setBounds(100, 0, 1020, 40); // 패널의 위치를 x : 100, y : 0, 가로 : 1020, 세로 : 40 설정
              
              add(p); 
	}
}
