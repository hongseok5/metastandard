package com.hongseok.metastandard.service.posts;

import com.hongseok.metastandard.domain.posts.Posts;
import com.hongseok.metastandard.domain.posts.PostsRepository;
import com.hongseok.metastandard.web.dto.PostsListResponseDto;
import com.hongseok.metastandard.web.dto.PostsResponseDto;
import com.hongseok.metastandard.web.dto.PostsSaveRequestDto;
import com.hongseok.metastandard.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto dto){
        return postsRepository.save(dto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto dto){
        Posts posts = postsRepository.findById(id)
                .orElseThrow( () -> new IllegalArgumentException("no posts : " + id ));
        posts.update(dto.getTitle(), dto.getContent());
        return id;
    }
    @Transactional(readOnly = true)
    public List<PostsListResponseDto> findAllDesc(){
        // .map(posts -> new PostsListResponseDto(posts)) 와 같다
        return postsRepository.findAllDesc().stream().map(PostsListResponseDto::new).collect(Collectors.toList());
    }

    public PostsResponseDto findById(Long id){
        Posts entity = postsRepository.findById(id)
                .orElseThrow( () -> new IllegalArgumentException("no posts : " +id));
        return new PostsResponseDto(entity);
    }

    @Transactional
    public void delete(Long id){
        Posts posts = postsRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("no posts. id=" + id));
        postsRepository.delete(posts);
    }
}
