package com.imall.pracite.helloworld.api;

import com.imall.pracite.helloworld.response.AjaxResponse;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public interface ArticleRestControllerApi {

    @ApiOperation(value = "添加文章", notes = "添加新的文章", tags = "Article", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "title", value = "文章标题", required = true, dataType = "String"),
            @ApiImplicitParam(name = "content", value = "文章内容", required = true, dataType = "String"),
            @ApiImplicitParam(name = "author", value = "文章作者", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = AjaxResponse.class),
    })
    @ResponseBody AjaxResponse saveArticle(
            @RequestParam(value = "title") String title,  //参数1
            @RequestParam(value = "content") String content,//参数2
            @RequestParam(value = "author") String author//参数3
    );
}
