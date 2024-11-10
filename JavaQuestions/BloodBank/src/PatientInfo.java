
public class PatientInfo {
	private String patientId;
	private String patientName;
	private String bloodType;
	private String rhFactor;
	private double volumeRequired;
	
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public String getRhFactor() {
		return rhFactor;
	}
	public void setRhFactor(String rhFactor) {
		this.rhFactor = rhFactor;
	}
	public double getVolumeRequired() {
		return volumeRequired;
	}
	public void setVolumeRequired(double volumeRequired) {
		this.volumeRequired = volumeRequired;
	}
	
	public PatientInfo(String patientId, String patientName, String bloodType, String rhFactor, double volumeRequired) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.bloodType = bloodType;
		this.rhFactor = rhFactor;
		this.volumeRequired = volumeRequired;
	}
	@Override
	public String toString() {
		return patientId+" "+patientName+" "+bloodType+" "+rhFactor+" "+volumeRequired;
	}
	
}
