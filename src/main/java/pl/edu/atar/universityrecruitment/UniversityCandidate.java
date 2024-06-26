package pl.edu.atar.universityrecruitment;

import java.util.ArrayList;

@org.kie.api.definition.type.PropertyReactive
public class UniversityCandidate implements java.io.Serializable
{
   private Long id;

   private String firstName;
   private String lastName;
   private String gender; 
   private Double examResult;
   private ArrayList<ExamSubjectResult> examSubjectResult;
   private Boolean admission = Boolean.FALSE;  
   private String fieldOfStudy;
   private Boolean olympicFinalist;
   private String qualificationType = "None";  
   private String logger = "";   
   private Integer counter = (Integer) 0;
   
public UniversityCandidate()
   {
   }

   public Long getId()
   {
      return this.id;
   }

   public void setId(Long id)
   {
      this.id = id;
   }

   public String getFirstName()
   {
      return this.firstName;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public String getLastName()
   {
      return this.lastName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public Double getExamResult()
   {
      return this.examResult;
   }

   public void setExamResult(Double examResult)
   {
      this.examResult = examResult;
   }

   public ArrayList<ExamSubjectResult> getExamSubjectResult() {
	  return examSubjectResult;
   }

   public void setExamSubjectResult(ArrayList<ExamSubjectResult> examSubjectResult) {
	  this.examSubjectResult = examSubjectResult;
   }

	public Boolean getAdmission()
   {
      return this.admission;
   }

   public void setAdmission(Boolean admission)
   {
      this.admission = admission;
   }
   
   public String getFieldOfStudy()
   {
      return this.fieldOfStudy;
   }

   public void setFieldOfStudy(String fieldOfStudy)
   {
      this.fieldOfStudy = fieldOfStudy;
   }

   public Boolean getOlympicFinalist()
   {
      return this.olympicFinalist;
   }

   public void setOlympicFinalist(Boolean olympicFinalist)
   {
      this.olympicFinalist = olympicFinalist;
   }

   public String getQualificationType()
   {
      return this.qualificationType;
   }

   public void setQualificationType(String qualificationType)
   {
      this.qualificationType = qualificationType;
   }
   
   public String getLogger()
   {
      return this.logger;
   }

   public void setLogger(String logger)
   {
      this.logger = logger;
   }

   public void appendLogger(String logger)
   {
      this.logger += logger + "\n";
   }   

   public Integer getCounter() {
	   return counter;
   }

   public void setCounter(Integer counter) {
	   this.counter = counter;
   }
   
   public void incrementCounter() {
	   this.counter++;
   }
   
   public String getGender() {
		return gender;
   }

	public void setGender(String gender) {
		this.gender = gender;
	}
	
   public String getCandidateInformation()
   {
      return  "First & last name: " + this.firstName + " " + this.lastName +
              "\nField of study: " + this.fieldOfStudy + " (" + this.examResult + " points, OlympicFinalist: " + this.olympicFinalist + ")" +
              "\n⮕ Admission: " + this.admission + ". Qualification type: " + this.qualificationType +
              "\nObject reference: " + Integer.toHexString(System.identityHashCode(this)) + "\n" + this.logger;
   }

   public String getCandidateInformationLogger()
   {
      String logger = (this.logger.isEmpty()) ? "" : "\n\nRULES FIRED WITH EXECUTION ORDER:\n" + this.logger;;

      return  "CANDIDATE:" +
              "\nFirst & last name: " + this.firstName + " " + this.lastName +
              "\nField of study: " + this.fieldOfStudy + " (" + this.examResult + " points, OlympicFinalist: " + this.olympicFinalist + ")" +
              "\nAdmission: " + this.admission +
              "\nQualification type: " + this.qualificationType +
              "\nObject reference: " + Integer.toHexString(System.identityHashCode(this));
   }

   public String getReasoningLogger()
   {
      return "RULES FIRED WITH EXECUTION ORDER:\n" + this.logger;
   }

   public String getCandidateSubjectsInformation()
   {
       StringBuilder information = new StringBuilder("CANDIDATE'S SUBJECTS:\n");

       for (ExamSubjectResult esr : this.examSubjectResult) {
           information.append("— ").append(esr.getExamSubject()).append(" : ").append(esr.getExamLevel()).append(" : ").append(esr.getExamResult()).append("\n");
       }
       return information.toString();
   }

   public UniversityCandidate(Long id, String firstName,
	         String lastName, Double examResult,
	         Boolean admission, String fieldOfStudy,
	         Boolean olympicFinalist, String qualificationType,
	         String logger, Integer counter, String gender)
	   {
	      this.id = id;
	      this.firstName = firstName;
	      this.lastName = lastName;
	      this.examResult = examResult;
	      this.admission = admission;
	      this.fieldOfStudy = fieldOfStudy;
	      this.olympicFinalist = olympicFinalist;
	      this.qualificationType = qualificationType;
	      this.logger = logger;
	      this.counter = counter;
	      this.gender = gender;
	   }

   public UniversityCandidate(Long id, String firstName,
	         String lastName, Double examResult,
	         Boolean admission, String fieldOfStudy,
	         Boolean olympicFinalist, String gender)
	   {
	      this.id = id;
	      this.firstName = firstName;
	      this.lastName = lastName;
	      this.examResult = examResult;
	      this.admission = admission;
	      this.fieldOfStudy = fieldOfStudy;
	      this.olympicFinalist = olympicFinalist;
	      this.gender = gender;
	   }
   
   public UniversityCandidate(Long id, String firstName,
	         String lastName, ArrayList<ExamSubjectResult> examSubjectResult,
	         Boolean admission, String fieldOfStudy,
	         Boolean olympicFinalist, String gender)
	   {
	      this.id = id;
	      this.firstName = firstName;
	      this.lastName = lastName;
	      this.examResult = 0.0D;
	      this.examSubjectResult = examSubjectResult;
	      this.admission = admission;
	      this.fieldOfStudy = fieldOfStudy;
	      this.olympicFinalist = olympicFinalist;
	      this.gender = gender;
	   }
}