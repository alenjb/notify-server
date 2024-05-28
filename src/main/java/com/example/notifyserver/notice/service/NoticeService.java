package com.example.notifyserver.notice.service;

import com.example.notifyserver.common.domain.NoticeType;
import com.example.notifyserver.notice.dto.NoticeResponse;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface NoticeService {
    /**
     * 로그인 하지 않은 사용자가 공지사항을 조회한다.
     * @param type 공지사항 종류
     * @param pageNum 조회할 페이지 번호
     * @return 페이지 정보 및 공지사항들
     * @throws Exception 서버 내부 오류 및 유효하지 않은 값 입력 오류
     */
    Page<NoticeResponse> getNoticesWithoutLogin(NoticeType type, int pageNum) throws Exception;
}
