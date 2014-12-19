/******************************************************************************* 
 *  Copyright 2009 Amazon Services.
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  
 *  You may not use this file except in compliance with the License. 
 *  You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 *  This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 *  CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 *  specific language governing permissions and limitations under the License.
 * ***************************************************************************** 
 *
 *  Marketplace Web Service Java Library
 *  API Version: 2009-01-01
 *  Generated: Wed Feb 18 13:28:48 PST 2009 
 * 
 */



package API.amazon.mws.feeds.actions;

import API.amazon.mws.feeds.model.ResponseMetadata;
import API.amazon.mws.feeds.model.GetReportScheduleCountResponse;
import API.amazon.mws.feeds.model.GetReportScheduleCountRequest;
import API.amazon.mws.feeds.model.GetReportScheduleCountResult;
import API.amazon.mws.feeds.service.MarketplaceWebServiceConfig;
import API.amazon.mws.feeds.service.MarketplaceWebServiceException;
import API.amazon.mws.feeds.service.MarketplaceWebServiceClient;
import API.amazon.mws.feeds.service.MarketplaceWebService;
import java.util.List;
import java.util.ArrayList;
import API.amazon.mws.feeds.mock.MarketplaceWebServiceMock;

/**
 *
 * Get Report Schedule Count  Samples
 *
 *
 */
public class GetReportScheduleCountSample {

    /**
     * Just add a few required parameters, and try the service
     * Get Report Schedule Count functionality
     *
     * @param args unused
     */
    public static void main(String... args) {

        /************************************************************************
         * Access Key ID and Secret Access Key ID, obtained from:
         * http://aws.amazon.com
         ***********************************************************************/
        final String accessKeyId = "<Your Access Key ID>";
        final String secretAccessKey = "<Your Secret Access Key>";

        final String appName = "<Your Application or Company Name>";
        final String appVersion = "<Your Application Version or Build Number or Release Date>";

        MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig();

        /************************************************************************
         * Uncomment to set the appropriate MWS endpoint.
         ************************************************************************/
        // US
        // config.setServiceURL("https://mws.amazonservices.com");
        // UK
        // config.setServiceURL("https://mws.amazonservices.co.uk");
        // Germany
        // config.setServiceURL("https://mws.amazonservices.de");
        // France
        // config.setServiceURL("https://mws.amazonservices.fr");
        // Italy
        // config.setServiceURL("https://mws.amazonservices.it");
        // Japan
        // config.setServiceURL("https://mws.amazonservices.jp");
        // China
        // config.setServiceURL("https://mws.amazonservices.com.cn");
        // Canada
        // config.setServiceURL("https://mws.amazonservices.ca");
        // India
        // config.setServiceURL("https://mws.amazonservices.in");

        /************************************************************************
         * You can also try advanced configuration options. Available options are:
         *
         *  - Signature Version
         *  - Proxy Host and Proxy Port
         *  - User Agent String to be sent to Marketplace Web Service
         *
         ***********************************************************************/

        /************************************************************************
         * Instantiate Http Client Implementation of Marketplace Web Service        
         ***********************************************************************/

        MarketplaceWebService service = new MarketplaceWebServiceClient(
                accessKeyId, secretAccessKey, appName, appVersion, config);

        /************************************************************************
         * Uncomment to try out Mock Service that simulates Marketplace Web Service 
         * responses without calling Marketplace Web Service  service.
         *
         * Responses are loaded from local XML files. You can tweak XML files to
         * experiment with various outputs during development
         *
         * XML files available under com/amazonaws/mws/mock tree
         *
         ***********************************************************************/
        // MarketplaceWebService service = new MarketplaceWebServiceMock();

        /************************************************************************
         * Setup request parameters and uncomment invoke to try out 
         * sample for Get Report Schedule Count 
         ***********************************************************************/

        /************************************************************************
         * Marketplace and Merchant IDs are required parameters for all 
         * Marketplace Web Service calls.
         ***********************************************************************/
        final String merchantId = "<Your Merchant ID>";

        GetReportScheduleCountRequest request = new GetReportScheduleCountRequest();
        request.setMerchant( merchantId );

        // @TODO: set request parameters here

        // invokeGetReportScheduleCount(service, request);

    }



    /**
     * Get Report Schedule Count  request sample
     * returns the number of report schedules
     *   
     * @param service instance of MarketplaceWebService service
     * @param request Action to invoke
     */
    public static void invokeGetReportScheduleCount(MarketplaceWebService service, GetReportScheduleCountRequest request) {
        try {

            GetReportScheduleCountResponse response = service.getReportScheduleCount(request);


            System.out.println ("GetReportScheduleCount Action Response");
            System.out.println ("=============================================================================");
            System.out.println ();

            System.out.print("    GetReportScheduleCountResponse");
            System.out.println();
            if (response.isSetGetReportScheduleCountResult()) {
                System.out.print("        GetReportScheduleCountResult");
                System.out.println();
                GetReportScheduleCountResult  getReportScheduleCountResult = response.getGetReportScheduleCountResult();
                if (getReportScheduleCountResult.isSetCount()) {
                    System.out.print("            Count");
                    System.out.println();
                    System.out.print("                " + getReportScheduleCountResult.getCount());
                    System.out.println();
                }
            } 
            if (response.isSetResponseMetadata()) {
                System.out.print("        ResponseMetadata");
                System.out.println();
                ResponseMetadata  responseMetadata = response.getResponseMetadata();
                if (responseMetadata.isSetRequestId()) {
                    System.out.print("            RequestId");
                    System.out.println();
                    System.out.print("                " + responseMetadata.getRequestId());
                    System.out.println();
                }
            } 
            System.out.println();
            System.out.println(response.getResponseHeaderMetadata());
            System.out.println();


        } catch (MarketplaceWebServiceException ex) {

            System.out.println("Caught Exception: " + ex.getMessage());
            System.out.println("Response Status Code: " + ex.getStatusCode());
            System.out.println("Error Code: " + ex.getErrorCode());
            System.out.println("Error Type: " + ex.getErrorType());
            System.out.println("Request ID: " + ex.getRequestId());
            System.out.print("XML: " + ex.getXML());
            System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
        }
    }

}
