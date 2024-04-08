package com.sh.app.movie.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieInfoDto {
    private Long id;

    private String title;

    private String posterUrl;

    private Integer runtime;
}
