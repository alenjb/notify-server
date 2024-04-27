package com.example.notifyserver.scrap.service;

import com.example.notifyserver.common.domain.Notice;
import com.example.notifyserver.scrap.domain.Scrap;
import com.example.notifyserver.user.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ScrapService {
    /**
     * 스크랩 목록에 해당 공지사항을 추가한다.
     * @param user 스크랩을 요청한 유저
     * @param notice 스크랩할 공지사항 객체
     * @return 스크랩한 공지사항의 스크랩 ID
     */
    long doScrap(User user, Notice notice);

    /**
     * 스크랩 목록에서 해당 스크랩을 제거한다.
     * @param user 스크랩 제거를 요청한 유저
     * @param notice 스크랩에서 제거할 공지사항 객체
     */
    void deleteScrap(User user, Notice notice);

    /**
     * 스크랩 목록에서 해당 페이지의 스크랩을 조회한다.
     * @param userId 스크랩 조회를 요청한 유저의 ID
     * @param pageNum 조회 페이지 번호
     * @return 페이지 번호에 해당하는 스크랩 리스트
     */
    List<Scrap> getScrap(long userId, long pageNum);
}
