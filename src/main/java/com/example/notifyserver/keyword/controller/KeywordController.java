package com.example.notifyserver.keyword.controller;

import com.example.notifyserver.common.dto.ApiResponse;
import com.example.notifyserver.common.dto.ErrorResponse;
import com.example.notifyserver.common.dto.SuccessNonDataResponse;
import com.example.notifyserver.common.dto.SuccessResponse;
import com.example.notifyserver.common.exception.enums.ErrorCode;
import com.example.notifyserver.common.exception.enums.SuccessCode;
import com.example.notifyserver.common.exception.model.NotFoundUserException;
import com.example.notifyserver.keyword.dto.request.KeywordAddRequest;
import com.example.notifyserver.keyword.service.KeywordService;
import com.example.notifyserver.user.dto.request.LoginRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/keyword")
public class KeywordController {

    private final KeywordService keywordService;
    @PostMapping
    public ApiResponse addKeyword(@RequestHeader("googleId") String googleId, @RequestBody KeywordAddRequest request) {
        try {
            return SuccessResponse.success(keywordService.addKeyword(request, googleId), SuccessCode.LOGIN_SUCCESS);
        } catch (NotFoundUserException e) {
            return ErrorResponse.error(ErrorCode.USER_NOT_FOUND_EXCEPTION);
        } catch (Exception e) {
            return ErrorResponse.error(ErrorCode.INTERNAL_SERVER_EXCEPTION);
        }
    }
}
