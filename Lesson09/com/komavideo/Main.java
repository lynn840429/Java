package com.komavideo;

import com.komavideo.entity.Player;
import com.komavideo.util.MyUtil;

public class Main {
    public static void main(String[] args) {
        int result = MyUtil.add(10, 20);
        System.out.println("result=" + result);

        Player player = new Player("Koma");
        player.sayHelo();
    }
}