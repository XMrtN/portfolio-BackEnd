package com.portfolio.martinsepulveda.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SocialDto {
    @NotBlank
    private String icon;
    @NotBlank
    private String url;
    
    //Constructors
    public SocialDto() {
    }

    public SocialDto(String icon, String url) {
        this.icon = icon;
        this.url = url;
    }
}
