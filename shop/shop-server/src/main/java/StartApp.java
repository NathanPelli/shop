import com.wx.dubbo.domain.HelloWorld;
import com.wx.dubbo.service.IHelloWorldService;

/**
 * Created By 002764
 * on 2018/10/22 16:40
 */
//@SpringBootApplication
//@ImportResource("classpath:dubbo-client.xml")
//@Controller
public class StartApp {
    //@Autowired
    private IHelloWorldService helloWorldService;
    public static  void main (String[] args){

        //SpringApplication.run(StartApp.class,args);
    }

   // @RequestMapping("/sayHello")
   // @ResponseBody
    public String sayHello(){
       // HelloWorld helloWorld =helloWorldService.sayHello(new HelloWorld());
        //return  helloWorld.getName();
        return null;
    }

}
