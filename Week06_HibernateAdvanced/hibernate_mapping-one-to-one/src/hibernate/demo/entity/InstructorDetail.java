package hibernate.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="youtube_channel")
	private String youtubeChanel;
	
	@Column(name="hobby")
	private String hobby;
	
	public InstructorDetail () {}
	
	public InstructorDetail(String youtubeChanel, String hobby) {
		this.youtubeChanel = youtubeChanel;
		this.hobby = hobby;
	}
	
	public String getYoutubeChanel() {
		return this.youtubeChanel;
	}
	public void setYoutubeChanel(String youtubeChanel) {
		this.youtubeChanel = youtubeChanel;
	}
	
	public String getHobby() {
		return this.hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youtubeChanel=" + youtubeChanel + ", hobby=" + hobby + "]";
	}
}
