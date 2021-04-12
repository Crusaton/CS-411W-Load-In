/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package odu.edu.loadin.webapi;



import odu.edu.loadin.common.MovingTruck;
import odu.edu.loadin.common.MovingTruckService;
import odu.edu.loadin.helpers.StatementHelper;

import javax.ws.rs.core.Response;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * This is  the actual implementation of the box service interface
 * This class contains one or more methods to manipulate box sizes in the database
 */
public class MovingTruckServiceImpl implements MovingTruckService {


    public MovingTruckServiceImpl() {

    }

    @Override
    public ArrayList<MovingTruck> getAllTrucks() throws SQLException {
        //we get a connection here

//        try(Connection conn = DatabaseConnectionProvider.getLoadInSqlConnection()){ //this is called a try with resources and with java 1.8
//            //this will auto-close the connection
//            PreparedStatement statement = conn.prepareStatement("SELECT * FROM BOX_SIZE");
//
//            //this is more of a transparent method.  person who is performing the query can decide how it gets mapped back to
//            //individual objects
//            ArrayList<MovingTruck> results = StatementHelper.getResults(statement, (ResultSet rs) -> {
//                BoxSize s = new BoxSize();
//                s.setId(rs.getInt("ID"));
//                s.setDescription(rs.getString("DESCRIPTION"));
//                s.setDimensions(rs.getString("DIMENSIONS"));
//                s.setCreatedAt(rs.getDate("CREATED_AT"));
//                s.setUpdatedAt(rs.getDate("UPDATED_AT"));
//                return s;
//            });
//            return results;
//        }
//        catch (SQLException ex){
//            //TODO: exception logging
//            System.out.println(ex);
//        }

        ArrayList<MovingTruck> test = new ArrayList<>();
        MovingTruck t = new MovingTruck();
        t.setCompanyName("UHAUL");
        t.setTruckName("17 footer");
        t.setWidthInInches(36);
        t.setHeightInInches(36);
        t.setLengthInInches(36);

        t.setBaseRentalCost(345);
        t.setMilesPerGallon(10);
        test.add(t);

        return test;
    }
}
