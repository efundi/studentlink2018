
package za.ac.nwu.wsdl.studentacademicregistration;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentAcademicRegistrationService", targetNamespace = "http://nwu.ac.za/wsdl/StudentAcademicRegistration")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StudentAcademicRegistrationService {


    /**
     * 
     * @param contextInfo
     * @param moduleOfferingSearchCriteriaInfo
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws OperationFailedException
     * @throws DoesNotExistException
     * @throws MissingParameterException
     * @throws PermissionDeniedException
     * @throws InvalidParameterException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentAcademicRegistrationByModuleOffering", targetNamespace = "http://nwu.ac.za/wsdl/StudentAcademicRegistration", className = "za.ac.nwu.wsdl.studentacademicregistration.GetStudentAcademicRegistrationByModuleOffering")
    @ResponseWrapper(localName = "getStudentAcademicRegistrationByModuleOfferingResponse", targetNamespace = "http://nwu.ac.za/wsdl/StudentAcademicRegistration", className = "za.ac.nwu.wsdl.studentacademicregistration.GetStudentAcademicRegistrationByModuleOfferingResponse")
    public List<String> getStudentAcademicRegistrationByModuleOffering(
        @WebParam(name = "moduleOfferingSearchCriteriaInfo", targetNamespace = "")
        ModuleOfferingSearchCriteriaInfo moduleOfferingSearchCriteriaInfo,
        @WebParam(name = "contextInfo", targetNamespace = "")
        ContextInfo contextInfo)
        throws DoesNotExistException, InvalidParameterException, MissingParameterException, OperationFailedException, PermissionDeniedException
    ;

    /**
     * 
     * @param contextInfo
     * @param academicPeriodInfo
     * @param univNumber
     * @return
     *     returns java.util.List<za.ac.nwu.wsdl.studentacademicregistration.StudentAcademicRegistrationInfo>
     * @throws OperationFailedException
     * @throws DoesNotExistException
     * @throws MissingParameterException
     * @throws PermissionDeniedException
     * @throws InvalidParameterException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentAcademicRegistration", targetNamespace = "http://nwu.ac.za/wsdl/StudentAcademicRegistration", className = "za.ac.nwu.wsdl.studentacademicregistration.GetStudentAcademicRegistration")
    @ResponseWrapper(localName = "getStudentAcademicRegistrationResponse", targetNamespace = "http://nwu.ac.za/wsdl/StudentAcademicRegistration", className = "za.ac.nwu.wsdl.studentacademicregistration.GetStudentAcademicRegistrationResponse")
    public List<StudentAcademicRegistrationInfo> getStudentAcademicRegistration(
        @WebParam(name = "univNumber", targetNamespace = "")
        String univNumber,
        @WebParam(name = "academicPeriodInfo", targetNamespace = "")
        AcademicPeriodInfo academicPeriodInfo,
        @WebParam(name = "contextInfo", targetNamespace = "")
        ContextInfo contextInfo)
        throws DoesNotExistException, InvalidParameterException, MissingParameterException, OperationFailedException, PermissionDeniedException
    ;

    /**
     * 
     * @param contextInfo
     * @return
     *     returns java.lang.String
     * @throws DoesNotExistException
     * @throws OperationFailedException
     * @throws MissingParameterException
     * @throws PermissionDeniedException
     * @throws InvalidParameterException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "resetService", targetNamespace = "http://nwu.ac.za/wsdl/StudentAcademicRegistration", className = "za.ac.nwu.wsdl.studentacademicregistration.ResetService")
    @ResponseWrapper(localName = "resetServiceResponse", targetNamespace = "http://nwu.ac.za/wsdl/StudentAcademicRegistration", className = "za.ac.nwu.wsdl.studentacademicregistration.ResetServiceResponse")
    public String resetService(
        @WebParam(name = "contextInfo", targetNamespace = "")
        ContextInfo contextInfo)
        throws DoesNotExistException, InvalidParameterException, MissingParameterException, OperationFailedException, PermissionDeniedException
    ;

    /**
     * 
     * @param contextInfo
     * @param studentModuleAcadInfo
     * @param systemLanguageTypeKey
     * @return
     *     returns za.ac.nwu.wsdl.studentacademicregistration.StudentModulePrerequisteResultInfo
     * @throws OperationFailedException
     * @throws DoesNotExistException
     * @throws MissingParameterException
     * @throws PermissionDeniedException
     * @throws InvalidParameterException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validateStudentModulePrerequisite", targetNamespace = "http://nwu.ac.za/wsdl/StudentAcademicRegistration", className = "za.ac.nwu.wsdl.studentacademicregistration.ValidateStudentModulePrerequisite")
    @ResponseWrapper(localName = "validateStudentModulePrerequisiteResponse", targetNamespace = "http://nwu.ac.za/wsdl/StudentAcademicRegistration", className = "za.ac.nwu.wsdl.studentacademicregistration.ValidateStudentModulePrerequisiteResponse")
    public StudentModulePrerequisteResultInfo validateStudentModulePrerequisite(
        @WebParam(name = "studentModuleAcadInfo", targetNamespace = "")
        StudentModuleAcademicInfo studentModuleAcadInfo,
        @WebParam(name = "systemLanguageTypeKey", targetNamespace = "")
        String systemLanguageTypeKey,
        @WebParam(name = "contextInfo", targetNamespace = "")
        ContextInfo contextInfo)
        throws DoesNotExistException, InvalidParameterException, MissingParameterException, OperationFailedException, PermissionDeniedException
    ;

    /**
     * 
     * @param contextInfo
     * @param academicPeriodInfo
     * @param systemLanguageTypeKey
     * @param univNumber
     * @return
     *     returns java.util.List<za.ac.nwu.wsdl.studentacademicregistration.StudentAcademicRegistrationInfo>
     * @throws DoesNotExistException
     * @throws OperationFailedException
     * @throws MissingParameterException
     * @throws PermissionDeniedException
     * @throws InvalidParameterException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentAcademicRegistrationByLang", targetNamespace = "http://nwu.ac.za/wsdl/StudentAcademicRegistration", className = "za.ac.nwu.wsdl.studentacademicregistration.GetStudentAcademicRegistrationByLang")
    @ResponseWrapper(localName = "getStudentAcademicRegistrationByLangResponse", targetNamespace = "http://nwu.ac.za/wsdl/StudentAcademicRegistration", className = "za.ac.nwu.wsdl.studentacademicregistration.GetStudentAcademicRegistrationByLangResponse")
    public List<StudentAcademicRegistrationInfo> getStudentAcademicRegistrationByLang(
        @WebParam(name = "univNumber", targetNamespace = "")
        String univNumber,
        @WebParam(name = "academicPeriodInfo", targetNamespace = "")
        AcademicPeriodInfo academicPeriodInfo,
        @WebParam(name = "systemLanguageTypeKey", targetNamespace = "")
        String systemLanguageTypeKey,
        @WebParam(name = "contextInfo", targetNamespace = "")
        ContextInfo contextInfo)
        throws DoesNotExistException, InvalidParameterException, MissingParameterException, OperationFailedException, PermissionDeniedException
    ;

}
