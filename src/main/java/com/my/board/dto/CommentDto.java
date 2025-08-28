package com.my.board.dto;

import com.my.board.entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {
    private Long id;
    private String nickname;
    private String body;
//    private Long article_id;

    // 엔티티 => DTO
    public static CommentDto fromCommentEntity(Comment comment) {
        return new CommentDto(
                comment.getId(),
                comment.getNickname(),
                comment.getBody()
        );
    }

    // DTO => 엔티티
    public static Comment fromCommentDto(CommentDto dto) {
        Comment comment = new Comment();
        comment.setId(dto.getId());
        comment.setNickname(dto.getNickname());
        comment.setBody(dto.getBody());
        return comment;
    }
}
