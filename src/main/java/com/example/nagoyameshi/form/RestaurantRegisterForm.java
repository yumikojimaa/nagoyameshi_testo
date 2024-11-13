package com.example.nagoyameshi.form;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class RestaurantRegisterForm {
	@NotBlank(message = "店舗名を入力してください。")
    private String name;
        
    private MultipartFile imageFile;
    
    @NotBlank(message = "説明を入力してください。")
    private String description;   
    
    @NotNull(message = "価格帯を入力してください。")
    @Min(value = 1, message = "価格帯は1円以上に設定してください。")
    private Integer lowestprice,highestprice;     
    
    @NotBlank(message = "郵便番号を入力してください。")
    private String postalCode;
    
    @NotBlank(message = "住所を入力してください。")
    private String address;
    
    @NotBlank(message = "定休日を入力してください。")
    private String regularholiday;
    
    @NotBlank(message = "営業時間を入力してください。")
    private String openingtime;
    
    @NotNull(message = "座席数を入力してください。")
    @Min(value = 1, message = "座席数は1人以上に設定してください。")
    private Integer seatingcapacity; 
    
    @NotBlank(message = "カテゴリを入力してください。")
    private Integer category;
    
}
