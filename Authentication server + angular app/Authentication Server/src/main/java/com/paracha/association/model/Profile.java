package com.paracha.association.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Date;

@Entity
@Table(name = "profiles")
public class Profile implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String fatherName;

    private Long cnic;

    private Date dob;

    private String gender;

    private String province;

    private String ppSeat;

    private String nationalAssembly;

    private String presentAddressLine1;

    private String presentAddressLine2;

    private String presentAddressDivision;

    private String presentTehsil;

    private String presentDistrict;

    private Long presentAddressZipCode;

    private String presentAddressCity;

    private String presentAddressCountry;

    private String permanentAddressLine1;

    private String permanentAddressLine2;

    private String permanentAddressDivision;

    private String permanentTehsil;

    private String permanentDistrict;

    private Long permanentAddressZipCode;

    private String permanentAddressCity;

    private String permanentAddressCountry;

    private String personalQualification;

    private String professionalQualification;

    private String businessQualification;

    private String professionQualification;

    private String employmentType;

    private String department;

    private String designationGrade;

    private String cellNumber;

    private String whatsAppNumber;

    @Column(name = "created_date", updatable = false)
    private ZonedDateTime createdDate = ZonedDateTime.now();

    @Column(name = "updated_date")
    private ZonedDateTime updatedDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Long getCnic() {
        return cnic;
    }

    public void setCnic(Long cnic) {
        this.cnic = cnic;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPpSeat() {
        return ppSeat;
    }

    public void setPpSeat(String ppSeat) {
        this.ppSeat = ppSeat;
    }

    public String getNationalAssembly() {
        return nationalAssembly;
    }

    public void setNationalAssembly(String nationalAssembly) {
        this.nationalAssembly = nationalAssembly;
    }

    public String getPresentAddressLine1() {
        return presentAddressLine1;
    }

    public void setPresentAddressLine1(String presentAddressLine1) {
        this.presentAddressLine1 = presentAddressLine1;
    }

    public String getPresentAddressLine2() {
        return presentAddressLine2;
    }

    public void setPresentAddressLine2(String presentAddressLine2) {
        this.presentAddressLine2 = presentAddressLine2;
    }

    public String getPresentAddressDivision() {
        return presentAddressDivision;
    }

    public void setPresentAddressDivision(String presentAddressDivision) {
        this.presentAddressDivision = presentAddressDivision;
    }

    public Long getPresentAddressZipCode() {
        return presentAddressZipCode;
    }

    public void setPresentAddressZipCode(Long presentAddressZipCode) {
        this.presentAddressZipCode = presentAddressZipCode;
    }

    public String getPresentAddressCity() {
        return presentAddressCity;
    }

    public void setPresentAddressCity(String presentAddressCity) {
        this.presentAddressCity = presentAddressCity;
    }

    public String getPresentAddressCountry() {
        return presentAddressCountry;
    }

    public void setPresentAddressCountry(String presentAddressCountry) {
        this.presentAddressCountry = presentAddressCountry;
    }

    public String getPermanentAddressLine1() {
        return permanentAddressLine1;
    }

    public void setPermanentAddressLine1(String permanentAddressLine1) {
        this.permanentAddressLine1 = permanentAddressLine1;
    }

    public String getPermanentAddressLine2() {
        return permanentAddressLine2;
    }

    public void setPermanentAddressLine2(String permanentAddressLine2) {
        this.permanentAddressLine2 = permanentAddressLine2;
    }

    public String getPermanentAddressDivision() {
        return permanentAddressDivision;
    }

    public void setPermanentAddressDivision(String permanentAddressDivision) {
        this.permanentAddressDivision = permanentAddressDivision;
    }

    public Long getPermanentAddressZipCode() {
        return permanentAddressZipCode;
    }

    public void setPermanentAddressZipCode(Long permanentAddressZipCode) {
        this.permanentAddressZipCode = permanentAddressZipCode;
    }

    public String getPermanentAddressCity() {
        return permanentAddressCity;
    }

    public void setPermanentAddressCity(String permanentAddressCity) {
        this.permanentAddressCity = permanentAddressCity;
    }

    public String getPermanentAddressCountry() {
        return permanentAddressCountry;
    }

    public void setPermanentAddressCountry(String permanentAddressCountry) {
        this.permanentAddressCountry = permanentAddressCountry;
    }

    public String getPersonalQualification() {
        return personalQualification;
    }

    public void setPersonalQualification(String personalQualification) {
        this.personalQualification = personalQualification;
    }

    public String getProfessionalQualification() {
        return professionalQualification;
    }

    public void setProfessionalQualification(String professionalQualification) {
        this.professionalQualification = professionalQualification;
    }

    public String getBusinessQualification() {
        return businessQualification;
    }

    public void setBusinessQualification(String businessQualification) {
        this.businessQualification = businessQualification;
    }

    public String getProfessionQualification() {
        return professionQualification;
    }

    public void setProfessionQualification(String professionQualification) {
        this.professionQualification = professionQualification;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignationGrade() {
        return designationGrade;
    }

    public void setDesignationGrade(String designationGrade) {
        this.designationGrade = designationGrade;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getWhatsAppNumber() {
        return whatsAppNumber;
    }

    public void setWhatsAppNumber(String whatsAppNumber) {
        this.whatsAppNumber = whatsAppNumber;
    }

    public ZonedDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(ZonedDateTime createdDate) {
        this.createdDate = createdDate;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ZonedDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(ZonedDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }


    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }


    public String getPresentTehsil() {
        return presentTehsil;
    }

    public void setPresentTehsil(String presentTehsil) {
        this.presentTehsil = presentTehsil;
    }

    public String getPresentDistrict() {
        return presentDistrict;
    }

    public void setPresentDistrict(String presentDistrict) {
        this.presentDistrict = presentDistrict;
    }

    public String getPermanentTehsil() {
        return permanentTehsil;
    }

    public void setPermanentTehsil(String permanentTehsil) {
        this.permanentTehsil = permanentTehsil;
    }

    public String getPermanentDistrict() {
        return permanentDistrict;
    }

    public void setPermanentDistrict(String permanentDistrict) {
        this.permanentDistrict = permanentDistrict;
    }
}
