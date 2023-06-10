package com.example._09_avoiddungserver.service.impl;

import com.example._09_avoiddungserver.entity.Ranking;
import com.example._09_avoiddungserver.repository.RankingRepository;
import com.example._09_avoiddungserver.service.RankingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RankingServiceImpl implements RankingService {
    private final RankingRepository rankRepository;

    public List<Ranking> getRanking() {
        return rankRepository.findTop10RankingByScore();
    }
}
