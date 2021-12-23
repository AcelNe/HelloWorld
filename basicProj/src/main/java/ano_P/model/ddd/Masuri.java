package ano_P.model.ddd;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hsm")
@Data
public class Masuri {
	String pname="하성민";
	
	@Resource
	Weapon bb;
}

@Component
@Data
class Weapon{
	String kind="목걸이";
	int power=100;
}

@Component("wp")
@Data
class MachineGun extends Weapon{
	public MachineGun() {
		kind="머신건";
		power=300;
	}
}