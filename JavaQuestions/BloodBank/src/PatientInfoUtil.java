import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PatientInfoUtil {
	public List<PatientInfo> retrievePatientInfoByBloodType(Stream<PatientInfo> patientInfoStream, String bloodType) {
		// Fill the code here
		// DONE BY ME
		return patientInfoStream.filter(n -> n.getBloodType().equals(bloodType)).toList();

//		return patientInfoStream.filter(k->k.getBloodType().equalsIgnoreCase(bloodType)).toList();
//		return patientInfoStream
//				.filter(p -> p.getBloodType().equals(bloodType))
//				.collect(Collectors.toList());
	}

	public List<PatientInfo> retrievePatientInfoByRhFactor(Stream<PatientInfo> patientInfoStream, String rhFactor) {
		// Fill the code here
		return patientInfoStream.filter(k -> k.getRhFactor().equals(rhFactor)).collect(Collectors.toList());
		// 19-10-2024 done
//		return patientInfoStream.filter(h->h.getRhFactor().equals(rhFactor)).toList();
		// DONE BY ME
//		return patientInfoStream
//				.filter(p -> p.getRhFactor().equals(rhFactor))
//				.collect(Collectors.toList());
	}

	public List<PatientInfo> retrievePatientInfoByVolumeRequiredInAscendingOrder(Stream<PatientInfo> patientInfoStream) {
		// Fill the code here
		return patientInfoStream.sorted(Comparator.comparing(PatientInfo:: getVolumeRequired)).toList();
//		return patientInfoStream.sorted(Comparator.comparing(PatientInfo::getVolumeRequired)).toList();
//		return patientInfoStream.sorted(Comparator.comparing(PatientInfo:: getVolumeRequired)).toList();
		// DONE BY ME
//		return patientInfoStream
//		.sorted(Comparator.comparing(PatientInfo::getVolumeRequired))
//		.collect(Collectors.toList());
	}
}
