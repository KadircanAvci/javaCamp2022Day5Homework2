package kodlama.io.Devs.demo.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProgrammingTechnologyRequest {
	private String name;
	private int programmingLanguageId;
}
