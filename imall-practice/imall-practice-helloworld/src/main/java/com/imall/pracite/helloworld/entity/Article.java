package com.imall.pracite.helloworld.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.io.Reader;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder(value={"content","title"})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Article implements Serializable {

    @JsonIgnore
    private Long id;

    @JsonProperty("auther")
    private String author;
    private String title;
    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    private List<Reader> reader;

}
