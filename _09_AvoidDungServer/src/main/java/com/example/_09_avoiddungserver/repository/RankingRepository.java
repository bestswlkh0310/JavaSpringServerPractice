package com.example._09_avoiddungserver.repository;

import com.example._09_avoiddungserver.entity.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RankingRepository extends JpaRepository<Ranking, Long> {
    @Query("SELECT r FROM ranking r ORDER BY r.score DESC")
    public List<Ranking> findTop10RankingByScore();
}
