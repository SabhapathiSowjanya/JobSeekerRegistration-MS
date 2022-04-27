package com.service.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="JOBSEEKER_REGISTRATION")
public class JobSeeker {
	
	@Id
	@Column(name="JOBSEEKER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int jobSeekerId;
	
	@Column(name="JOBSEEKER_NAME")
	@NotBlank(message="611: Name cannot be left blank")
	@Pattern(regexp="^[A-Za-z]*$",message="511: Name cannot contain special characters or numbers")
	private String jobSeekerName;
	
	@Column(name="JOBSEEKER_ADDRESS")
	@Size(max=100,message="512: Address cannot exceeds more than 100 characters")
	@NotBlank(message="612: Address cannot be left blank")
	private String jobSeekerAddress;
	
	@Column(name="JOBSEEKER_EMAIL")
	@NotBlank(message="613: E-Mail cannot be left blank")
	@Email(message="513: Not a Valid Email")
	private String email;
	
	@Column(name="JOBSEEKER_CONTACT")
	@Range(min=10,message="514: Phone number must be 10 digits maximum")
	private int contactNo;
	
	@Column(name="JOBSEEKER_TYPE")
	private String type;
	
	@Column(name="JOBSEEKER_DOB")
	@NotNull(message="615: DOB cannot be left blank")
	private Date dateofBirth;
	
	@Column(name="TENGTH_PERCENTAGE")
	@DecimalMin(message="616: TenthMarks cannot be left blank", value = "2")
	private float tenthMarks;
	
	@Column(name="TWELTH_PERCENTAGE")
	@DecimalMin(message="617: TwelthMarks cannot be left blank",value="2")
	private float twelthMarks;
	
	@Column(name="UG_PERCENTAGE")
	@DecimalMin(message="618: UGMarks cannot be left blank",value="2")
	private float ugMarks;

	
}
