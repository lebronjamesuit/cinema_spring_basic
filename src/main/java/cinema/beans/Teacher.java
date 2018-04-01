package cinema.beans;

import org.springframework.stereotype.Component;

@Component
public class Teacher implements People {

	private String teacherName;

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getName() {
		return teacherName;
	}

	public String getTeacherName() {
		return teacherName;
	}
	
}
