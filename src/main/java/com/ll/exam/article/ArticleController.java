package com.ll.exam.article;

import com.ll.exam.Rq;
import com.ll.exam.article.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

public class ArticleController {
    public void showList(Rq rq){
        List<ArticleDto> articles = new ArrayList<>();
        articles.add(new ArticleDto(1, "제목1", "내용1"));
        articles.add(new ArticleDto(2, "제목2", "내용2"));
        articles.add(new ArticleDto(3, "제목3", "내용3"));

        rq.setAttr("articles", articles);
        rq.view("/jsp/usr/article/list");

    }

    public void showWrite(Rq rq) {
        rq.view("/jsp/usr/article/write");
    }
}
