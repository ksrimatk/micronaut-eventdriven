package hello.world;

import com.cts.eda.mnt.kfk.producer.TokenUpdateBean;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;
import java.util.concurrent.ThreadLocalRandom;

@Controller("/tokenUpdate")
public class HelloController {

    @Inject
    TokenUpdateBean tokenUpdateBean;

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        String tokenId = Integer.valueOf(ThreadLocalRandom.current().nextInt(100000, 999999)).toString();
        tokenUpdateBean.sendSampleMessage(tokenId, tokenId+"Active");
        return "Token Number"+tokenId;
    }
}
