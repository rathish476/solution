package com.Rumble.License;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.Rumble.License.Constants.BloodGroup;
import com.Rumble.License.Constants.Gender;
import com.Rumble.License.Constants.IdProof;
import com.Rumble.License.Constants.VehicleType;
import com.Rumble.License.DAO.LicenseDAO;
import com.Rumble.License.DAO.Impl.LicenseDAOImpl;
import com.Rumble.License.DTO.AddressDTO;
import com.Rumble.License.DTO.LicenseDTO;

public class LicenseTester {

	public static void main(String[] args) {

		AddressDTO addressDTO = new AddressDTO(54, "NA", 577101, "Chikmagalur", "Chikmagalur", "Kar", "Na");

		Date dob = new Date();// 26/03/1997
		SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
		try {
			dob=format.parse("26/03/1997");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		LicenseDTO dto = new LicenseDTO("Rathish", 23, addressDTO, dob, 849234446, BloodGroup.AB_POSITIVE,
				Gender.MALE);
		dto.setIdProof(IdProof.AADHAR);
		dto.setIdProofNo("6323 2387 0282");
		dto.setCommercial(false);
		dto.setDisablity(false);
		dto.setStartdate(new Date());// change to future
		dto.setVehicleType(VehicleType.TWO_WHEELER);

		LicenseDAO dao = new LicenseDAOImpl();
		dao.save(dto);// DAO
			// CRUD----
		LicenseDTO dtoFound = dao.findByIdProofNo("6323 2387 0282");
		System.out.println(dtoFound);

		boolean updated=dao.updateVehicleTypeByIdProofNo("6323 2387 0282", VehicleType.LMV);
		System.out.println("updated "+ updated);
		
		
		LicenseDTO dtoafterUpdate=dao.findByIdProofNo("6323 2387 0282");
		System.out.println(dtoafterUpdate);
	}
}
