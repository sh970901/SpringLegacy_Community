package com.ll.exam.article;

import com.ll.exam.Rq;
import com.ll.exam.article.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

public class ArticleController {
    private ArticleService articleService;

    public ArticleController() {
        articleService = new ArticleService();
    }
    public void showList(Rq rq){
        List<ArticleDto> articles = new ArrayList<>();
        articles.add(new ArticleDto(1, "제목1", "내용1"));
        String title = rq.getParam("title", "");
        String body = rq.getParam("body", "");

        long id = articleService.write(title, body);

        rq.appendBody("%d번 게시물이 생성 되었습니다.".formatted(id));
    }

    public void showWrite(Rq rq) {
        rq.view("/jsp/usr/article/write");
    }

    public void doWrite(Rq rq) {
        String title = rq.getParam("title", "");
        String body = rq.getParam("body", "");

        rq.appendBody("<div>title : %s</div>".formatted(title));
        rq.appendBody("<div>body : %s</div>".formatted(body));
    }
}
