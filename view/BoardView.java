
package view;

import model.Board;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class BoardView {
    public static void boMain() {
        List<Board> articles = new ArrayList<>();
        UtilService util = UtilServiceImpl.getInstance();

        for (int i = 0; i < 7; i++) {
            articles.add(Board.builder()
                    .title(util.createRandomTitles())
                    .content(util.createRandomContents())
                    .writer(util.createRandomName())
                    .build());

        }

        //foreach ex.
//        for(BoardDto boDto : articles){
//            System.out.println(boDto.getTitle()+" :\t"+
//                    boDto.getContent()+" :\t"+
//                    boDto.getWriter());
//        }

        //stream ex.
        articles.forEach(i -> {
            System.out.println(i.toString());
        });


    }
}