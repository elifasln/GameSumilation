package Core.concretes;

import Core.abstracts.GamerCheckService;
import entities.concretes.Gamer;

public class CheckGamerAdapter implements GamerCheckService {

	@Override
	public void GamerCheck(Gamer gamer) {
CheckGamerId checkGamer	=new CheckGamerId();
boolean check=checkGamer.CheckGamer(gamer.getId(),gamer.getNationalityId(),gamer.getFirstName(),gamer.getLastName(),gamer.getEmail(), gamer.getDateOfBirth());
if(check) {
	System.out.println("kimlik do�ru: "+gamer.getFirstName()+" "+gamer.getLastName());
}
else
{
	System.out.println("kimlik yanl��: "+gamer.getFirstName()+" "+gamer.getLastName());
	
}

	}

}
