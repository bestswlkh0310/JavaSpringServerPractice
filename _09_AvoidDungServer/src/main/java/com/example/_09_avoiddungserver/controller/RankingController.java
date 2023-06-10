package com.example._09_avoiddungserver.controller;

import com.example._09_avoiddungserver.entity.ResponseDto;
import com.example._09_avoiddungserver.service.RankingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequiredArgsConstructor
@RequestMapping("/avoid-dung")
public class RankingController {

    private final RankingService rankingService;
    @GetMapping("ranking")
    public ResponseEntity<?> getRanking() {
        return new ResponseEntity<>(
                ResponseDto.builder()
                        .status(200)
                        .data(rankingService.getRanking())
                        .build()
                , HttpStatus.OK
        );
    }

    /*@PostMapping("ranking")
    public ResponseEntity<?> patchRanking(
            @RequestParam("nick-name") String nickName,
            @RequestParam("score") int score) {
        return new ResponseEntity<>(
                ResponseDto.builder()
                        .status(200)
                        .data(rankingService)
                , HttpStatus.OK
        );
    }*/
}
