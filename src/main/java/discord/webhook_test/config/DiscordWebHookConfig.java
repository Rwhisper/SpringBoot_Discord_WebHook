package discord.webhook_test.config;

import discord.webhook_test.Service.WebHookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiscordWebHookConfig {

    @Bean
    public WebHookService webHookService(){
        return new WebHookService();
    }

}
