package ano_P;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import ano_P.model.ZaeRyo;
import ano_P.model.ZziGae;

@ComponentScan(basePackages="ano_P.model")
@ImportResource("anno_zml/autowired.xml")
public class ClassAnno {
	
	@Bean
	ZaeRyo dubu() {
		ZaeRyo res=new ZaeRyo();
		res.setTitle("두부");
		res.setKind("콩류");
		
		return res;
	}
	
	@Bean
	ZaeRyo bigPa() {
		ZaeRyo res=new ZaeRyo();
		res.setTitle("대파");
		res.setKind("채소");
		return res;
	}
	
	@Bean
	ZaeRyo dongTae() {
		ZaeRyo res=new ZaeRyo();
		res.setTitle("동태");
		res.setKind("생선");
		return res;
	}
	
	@Bean
	ZziGae kczg(ZaeRyo bigPa, ZaeRyo dubu) {//자동으로 매개변수 이름에 맞는 bean메소드 실행
		System.out.println("kczg 실행:"+bigPa+", "+dubu);
		ZziGae res=new ZziGae();
		res.setTitle("김치찌개");
		res.setZr1(bigPa);
		res.setZr2(dubu);
		
		return res;
	}
	
	@Bean
	ZaeRyo zr1() {//자동으로 매개변수 이름에 맞는 bean메소드 실행
		ZaeRyo res=new ZaeRyo();
		res.setTitle("zr1찌개");
		res.setKind("중간종류");
		
		return res;
	}
	
	@Bean(name="zr2")
	ZaeRyo udt() {//자동으로 매개변수 이름에 맞는 bean메소드 실행
		ZaeRyo res=new ZaeRyo();
		res.setTitle("udt");
		res.setKind("해군");
		
		return res;
	}
	
	@Bean(autowire=Autowire.BY_NAME)
	ZziGae militory() {//자동으로 매개변수 이름에 맞는 bean메소드 실행
		System.out.println("부대찌개 실행:");
		ZziGae res=new ZziGae();
		res.setTitle("부대찌개");
		
		return res;
	}
	
//	@Bean(autowire=Autowire.BY_NAME)
	ZziGae soBean() {//자동으로 매개변수 이름에 맞는 bean메소드 실행
		System.out.println("된장찌개 실행:");
		ZziGae res=new ZziGae();
		res.setTitle("된장찌개");
		
		return res;
	}
}
