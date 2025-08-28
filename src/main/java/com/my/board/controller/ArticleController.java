package com.my.board.controller;

import com.my.board.dto.ArticleDto;
import com.my.board.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/articles")
@RequiredArgsConstructor // @Autowired(생성자 주입) 필요 x
public class ArticleController {
    private final ArticleService articleService;

    @GetMapping({"", "/"})
    public String showArticles(Model model) {
        // controller => service => dao에 data 요청
        // dao : data access object
        List<ArticleDto> articles = articleService.getAllArticle();
        model.addAttribute("articles", articles);
        return "/articles/show_all";
    }
}
