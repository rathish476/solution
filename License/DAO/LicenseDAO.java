package com.Rumble.License.DAO;

import com.Rumble.License.Constants.VehicleType;
import com.Rumble.License.DTO.LicenseDTO;

public interface LicenseDAO {

	void save(LicenseDTO dto);
	
	LicenseDTO findByIdProofNo(String idProofNo);
	
	boolean updateVehicleTypeByIdProofNo(String idProof,VehicleType type);
	
	boolean deleteByIdProofNo(String idPrrof);
	
}