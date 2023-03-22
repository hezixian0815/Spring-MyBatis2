import com.hzx.mapper.GoodsMapper;
import com.hzx.pojo.Goods;
import com.hzx.service.GoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class logTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    GoodsService goodsService = (GoodsService)applicationContext.getBean("goodsService");
    GoodsMapper goodsMapper = (GoodsMapper)applicationContext.getBean("goodsMapper");
    @Test
    public void add(){
        goodsService.addGoods(new Goods(null,"三国演义",1002,99));
    }
    @Test
    public void update(){
        Goods goods = new Goods(18, null, null, null);
        goodsService.updateGoods(goods);
    }
    @Test
    public void delete(){
        Goods goods = new Goods(20, "三毛奇遇记", 1002, 66);
        goodsService.deleteGoodsById(goods);
    }
    @Test
    public void selectAll(){
        System.out.println(goodsMapper.selectAll());
    }
    @Test
    public void selectOne(){
        System.out.println(goodsMapper.selectGoodsAndType(1));
    }
}
