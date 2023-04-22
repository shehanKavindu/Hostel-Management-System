package lk.HostelManagementSystem.bo.custom.impl;


import java.util.ArrayList;
import java.util.Iterator;

import lk.HostelManagementSystem.bo.custom.PayementBO;
import lk.HostelManagementSystem.dao.DAOFactory;
import lk.HostelManagementSystem.dao.custom.QueryDAO;
import lk.HostelManagementSystem.dto.CustomDTO;
import lk.HostelManagementSystem.entity.CustomEntity;
import lk.ijse.hostel_management_system.bo.custom.PaymentDetailsBO;
import lk.ijse.hostel_management_system.dao.DAOFactory;
import lk.ijse.hostel_management_system.dao.DAOType;
import lk.ijse.hostel_management_system.dao.custom.QueryDAO;
import lk.ijse.hostel_management_system.dto.CustomDTO;
import lk.ijse.hostel_management_system.entity.CustomEntity;

public class PayementBOImpl implements PayementBO {
    private QueryDAO queryDAO;

    public PayementBOImpl() {
        DAOFactory DAOFactory;
        this.queryDAO = (QueryDAO)DAOFactory.getInstance().getDAOType(DAOType.QUERY);
    }

    public ArrayList<CustomDTO> getAllPendingPayementStudent() {
        ArrayList<CustomEntity> customEntities = this.queryDAO.getAllPendingPayementStudent();
        ArrayList<CustomDTO> customDTOS = new ArrayList();
        Iterator var3 = customEntities.iterator();

        while(var3.hasNext()) {
            CustomEntity c = (CustomEntity)var3.next();
            customDTOS.add(new CustomDTO(c.getStudent_id(), c.getName(), c.getAddress(), c.getContact_no(), c.getDob(), c.getGender()));
        }

        return customDTOS;
    }
}
