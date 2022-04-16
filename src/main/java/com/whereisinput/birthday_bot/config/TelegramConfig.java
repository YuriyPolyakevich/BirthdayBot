package com.whereisinput.birthday_bot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pengrad.telegrambot.TelegramBot;

/**
 * Created by yuriy_polyakevich at 4/16/22
 */
@Configuration
public class TelegramConfig {

    @Bean
    public TelegramBot getTelegramBot(@Value("${telegram.bot.token}") final String botToken) {
        return new TelegramBot(botToken);
    }

}