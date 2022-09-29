package discord.webhook_test.Service;
import org.json.simple.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class WebHookService {
    private String url= ""; // 디스코드 웹훅주소

    public void callEvent(){
        JSONObject data = new JSONObject();

        data.put("content", "[알림] 이벤트가 발생하였습니다");

        send(data);
    }

    private void send(JSONObject object){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> entity = new HttpEntity<>(object.toString(), headers);
        restTemplate.postForObject(url, entity, String.class);
    }
}
