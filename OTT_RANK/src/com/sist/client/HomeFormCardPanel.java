package com.sist.client;

import javax.swing.*;
import java.awt.*;

// MediaItem의 데이터들을 어떻게 배치하고 카드 형태로 만들지
public class HomeFormCardPanel extends JPanel {

    // 필요한 필드 선언
    private HomeFormMediaItem item;

    // 생성자
    public HomeFormCardPanel(HomeFormMediaItem item) {
        this.item = item;
        // 구현예정
    }

    // 썸네일 설정 메서드
    public void setThumbnail(Icon icon) {
        // 구현 예정
    }

    // 선택/호버 상태 등 스타일 변경 메서드
    public void setSelected(boolean selected) {
        // 구현 예정
    }
}
