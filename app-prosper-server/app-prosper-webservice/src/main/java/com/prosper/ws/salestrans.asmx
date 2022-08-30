<?xml version='1.0' encoding='UTF-8'?><wsdl:definitions targetNamespace="http://tempurl.org" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:tns="http://tempurl.org" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
<s:schema elementFormDefault="qualified" targetNamespace="http://tempurl.org" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:tns="http://tempurl.org" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
      <s:element name="test_a_plus_b">
        <s:complexType>
          <s:sequence>
            <s:element maxOccurs="1" minOccurs="1" name="al_value1" type="s:int" />
            <s:element maxOccurs="1" minOccurs="1" name="al_value2" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="test_a_plus_bResponse">
        <s:complexType>
          <s:sequence>
            <s:element maxOccurs="1" minOccurs="1" name="test_a_plus_bResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="getversion">
        <s:complexType />
      </s:element>
      <s:element name="getversionResponse">
        <s:complexType>
          <s:sequence>
            <s:element maxOccurs="1" minOccurs="0" name="getversionResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="getcompanyname">
        <s:complexType />
      </s:element>
      <s:element name="getcompanynameResponse">
        <s:complexType>
          <s:sequence>
            <s:element maxOccurs="1" minOccurs="0" name="getcompanynameResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="postsalescreate">
        <s:complexType>
          <s:sequence>
            <s:element maxOccurs="1" minOccurs="0" name="astr_request" type="tns:postsalescreaterequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="postsalescreaterequest">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="header" type="tns:requestheader" />
          <s:element maxOccurs="1" minOccurs="0" name="salestotal" type="tns:saleshdr" />
          <s:element maxOccurs="1" minOccurs="0" name="salesitems" type="tns:ArrayOfSalesitem" />
          <s:element maxOccurs="1" minOccurs="0" name="salestenders" type="tns:ArrayOfSalestender" />
          <s:element maxOccurs="1" minOccurs="0" name="salesdlvy" type="tns:salesdelivery" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="requestheader">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="licensekey" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="username" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="password" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="lang" type="s:string" />
          <s:element maxOccurs="1" minOccurs="1" name="pagerecords" type="s:int" />
          <s:element maxOccurs="1" minOccurs="1" name="pageno" type="s:int" />
          <s:element maxOccurs="1" minOccurs="1" name="updatecount" type="s:int" />
          <s:element maxOccurs="1" minOccurs="0" name="messagetype" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="messageid" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="version" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="saleshdr">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="localstorecode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="reservedocno" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="txdate_yyyymmdd" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="txtime_hhmmss" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="mallid" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="storecode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="tillid" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="salestype" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="txdocno" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="orgtxdate_yyyymmdd" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="orgstorecode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="orgtillid" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="orgtxdocno" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="mallitemcode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="cashier" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="vipcode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="salesman" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="demographiccode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="demographicdata" type="s:string" />
          <s:element maxOccurs="1" minOccurs="1" name="netqty" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="originalamount" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="sellingamount" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="0" name="couponnumber" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="coupongroup" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="coupontype" type="s:string" />
          <s:element maxOccurs="1" minOccurs="1" name="couponqty" type="s:short" />
          <s:element maxOccurs="1" minOccurs="0" name="totaldiscount" type="tns:ArrayOfSalesdiscount" />
          <s:element maxOccurs="1" minOccurs="1" name="ttltaxamount1" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="ttltaxamount2" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="netamount" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="paidamount" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="changeamount" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="0" name="priceincludetax" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="shoptaxgroup" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="extendparam" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="invoicetitle" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="invoicecontent" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="issueby" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="issuedate_yyyymmdd" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="issuetime_hhmmss" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="ecorderno" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="buyerremark" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="orderremark" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="status" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="ttpossalesdocno" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfSalesdiscount">
        <s:sequence>
          <s:element maxOccurs="unbounded" minOccurs="0" name="salesdiscount" nillable="true" type="tns:salesdiscount" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="salesdiscount">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="discountapprove" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="discountmode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="1" name="discountvalue" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="discountless" type="s:decimal" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfSalesitem">
        <s:sequence>
          <s:element maxOccurs="unbounded" minOccurs="0" name="salesitem" nillable="true" type="tns:salesitem" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="salesitem">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="iscounteritemcode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="1" name="lineno" type="s:int" />
          <s:element maxOccurs="1" minOccurs="0" name="storecode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="mallitemcode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="counteritemcode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="itemcode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="producttype" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="productname" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="plucode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="colorcode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="sizecode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="itemlotnum" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="serialnum" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="isdeposit" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="iswholesale" type="s:string" />
          <s:element maxOccurs="1" minOccurs="1" name="invttype" type="s:short" />
          <s:element maxOccurs="1" minOccurs="1" name="qty" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="exstk2sales" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="originalprice" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="sellingprice" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="0" name="pricemode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="priceapprove" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="couponnumber" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="coupongroup" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="coupontype" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="itemdiscount" type="tns:ArrayOfSalesdiscount" />
          <s:element maxOccurs="1" minOccurs="1" name="vipdiscountpercent" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="vipdiscountless" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="0" name="promotion" type="tns:ArrayOfSalespromtion" />
          <s:element maxOccurs="1" minOccurs="1" name="totaldiscountless1" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="totaldiscountless2" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="totaldiscountless" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="0" name="tax" type="tns:ArrayOfSalestax" />
          <s:element maxOccurs="1" minOccurs="1" name="netamount" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="bonusearn" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="0" name="salesitemremark" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="refundreasoncode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="extendparam" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfSalespromtion">
        <s:sequence>
          <s:element maxOccurs="unbounded" minOccurs="0" name="salespromtion" nillable="true" type="tns:salespromtion" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="salespromtion">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="promotionid" type="s:string" />
          <s:element maxOccurs="1" minOccurs="1" name="promotionuseqty" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="promotionless" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="promotionpkgcount" type="s:decimal" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfSalestax">
        <s:sequence>
          <s:element maxOccurs="unbounded" minOccurs="0" name="salestax" nillable="true" type="tns:salestax" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="salestax">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="1" name="taxrate" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="taxamount" type="s:decimal" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfSalestender">
        <s:sequence>
          <s:element maxOccurs="unbounded" minOccurs="0" name="salestender" nillable="true" type="tns:salestender" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="salestender">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="1" name="lineno" type="s:int" />
          <s:element maxOccurs="1" minOccurs="0" name="tendercode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="1" name="tendertype" type="s:short" />
          <s:element maxOccurs="1" minOccurs="1" name="tendercategory" type="s:short" />
          <s:element maxOccurs="1" minOccurs="1" name="payamount" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="baseamount" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="excessamount" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="0" name="extendparam" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="remark" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="salesdelivery">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="receiver_name" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="receiver_country" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="receiver_province" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="receiver_city" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="receiver_district" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="receiver_address1" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="receiver_address2" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="receiver_address3" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="receiver_address4" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="receiver_postal" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="receiver_mobile" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="receiver_phone" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="logisticscompany" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="logisticsdocno" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="expectdeliverydate_yyyymmdd" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="deliveryremarks" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="postsalescreateResponse">
        <s:complexType>
          <s:sequence>
            <s:element maxOccurs="1" minOccurs="0" name="postsalescreateResult" type="tns:postsalescreateresponse" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="postsalescreateresponse">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="header" type="tns:responseheader" />
          <s:element maxOccurs="1" minOccurs="0" name="salestotal" type="tns:saleshdr" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="responseheader">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="1" name="responsecode" type="s:short" />
          <s:element maxOccurs="1" minOccurs="0" name="responsemessage" type="s:string" />
          <s:element maxOccurs="1" minOccurs="1" name="pagerecords" type="s:int" />
          <s:element maxOccurs="1" minOccurs="1" name="pageno" type="s:int" />
          <s:element maxOccurs="1" minOccurs="1" name="updatecount" type="s:int" />
          <s:element maxOccurs="1" minOccurs="1" name="maxrecords" type="s:int" />
          <s:element maxOccurs="1" minOccurs="1" name="maxpageno" type="s:int" />
          <s:element maxOccurs="1" minOccurs="0" name="messagetype" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="messageid" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="version" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="postdailysalessummary">
        <s:complexType>
          <s:sequence>
            <s:element maxOccurs="1" minOccurs="0" name="astr_request" type="tns:postdailysalessummaryrequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="postdailysalessummaryrequest">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="header" type="tns:requestheader" />
          <s:element maxOccurs="1" minOccurs="0" name="salessummary" type="tns:dailysalessummary" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="dailysalessummary">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="localstorecode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="txdate_yyyymmdd" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="txtime_hhmmss" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="mallid" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="storecode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="tillid" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="txdocno" type="s:string" />
          <s:element maxOccurs="1" minOccurs="1" name="ttlsalesqty" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="ttlrefundqty" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="ttlsalesamt" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="ttlrefundamt" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="ttldoccount" type="s:int" />
          <s:element maxOccurs="1" minOccurs="0" name="cashier" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="issuedate_yyyymmdd" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="postdailysalessummaryResponse">
        <s:complexType>
          <s:sequence>
            <s:element maxOccurs="1" minOccurs="0" name="postdailysalessummaryResult" type="tns:postdailysalessummaryresponse" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="postdailysalessummaryresponse">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="header" type="tns:responseheader" />
        </s:sequence>
      </s:complexType>
      <s:element name="postdailysalessummary2">
        <s:complexType>
          <s:sequence>
            <s:element maxOccurs="1" minOccurs="0" name="astr_request" type="tns:postdailysalessummary2request" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="postdailysalessummary2request">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="header" type="tns:requestheader" />
          <s:element maxOccurs="1" minOccurs="0" name="salessummary" type="tns:dailysalessummary2" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="dailysalessummary2">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="localstorecode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="txdate_yyyymmdd" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="txtime_hhmmss" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="mallid" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="storecode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="tillid" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="txdocno" type="s:string" />
          <s:element maxOccurs="1" minOccurs="1" name="ttlsalesqty" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="ttlrefundqty" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="ttlsalesamt" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="ttlrefundamt" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="ttldoccount" type="s:int" />
          <s:element maxOccurs="1" minOccurs="0" name="cashier" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="issuedate_yyyymmdd" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="iszerosales" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="remarks" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="postdailysalessummary2Response">
        <s:complexType>
          <s:sequence>
            <s:element maxOccurs="1" minOccurs="0" name="postdailysalessummary2Result" type="tns:postdailysalessummary2response" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="postdailysalessummary2response">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="header" type="tns:responseheader" />
        </s:sequence>
      </s:complexType>
      <s:element name="postdailysalesestimatecreate">
        <s:complexType>
          <s:sequence>
            <s:element maxOccurs="1" minOccurs="0" name="astr_request" type="tns:postdailysalesestimatecreaterequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="postdailysalesestimatecreaterequest">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="header" type="tns:requestheader" />
          <s:element maxOccurs="1" minOccurs="0" name="salesestimate" type="tns:dailysalesestimate" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="dailysalesestimate">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="localstorecode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="txdate_yyyymmdd" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="txtime_hhmmss" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="mallid" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="storecode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="tillid" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="txdocno" type="s:string" />
          <s:element maxOccurs="1" minOccurs="1" name="estsalesqty" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="estsalesamt" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="estdoccount" type="s:int" />
          <s:element maxOccurs="1" minOccurs="0" name="cashier" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="issuedate_yyyymmdd" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="remarks" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="postdailysalesestimatecreateResponse">
        <s:complexType>
          <s:sequence>
            <s:element maxOccurs="1" minOccurs="0" name="postdailysalesestimatecreateResult" type="tns:postdailysalesestimatecreateresponse" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="postdailysalesestimatecreateresponse">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="header" type="tns:responseheader" />
        </s:sequence>
      </s:complexType>
      <s:element name="postmalldailysalessummary">
        <s:complexType>
          <s:sequence>
            <s:element maxOccurs="1" minOccurs="0" name="astr_request" type="tns:postmalldailysalessummaryrequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="postmalldailysalessummaryrequest">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="header" type="tns:requestheader" />
          <s:element maxOccurs="1" minOccurs="0" name="salessummary" type="tns:malldailysalessummary" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="malldailysalessummary">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="mallstorecode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="mallid" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="txdate_yyyymmdd" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="txtime_hhmmss" type="s:string" />
          <s:element maxOccurs="1" minOccurs="1" name="ttlsalesqty" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="ttlsalesamt" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="ttldoccount" type="s:int" />
          <s:element maxOccurs="1" minOccurs="1" name="salesstorecount" type="s:int" />
          <s:element maxOccurs="1" minOccurs="1" name="missuploadcount" type="s:int" />
          <s:element maxOccurs="1" minOccurs="1" name="storemodifycount" type="s:int" />
          <s:element maxOccurs="1" minOccurs="0" name="remarks" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="postmalldailysalessummaryResponse">
        <s:complexType>
          <s:sequence>
            <s:element maxOccurs="1" minOccurs="0" name="postmalldailysalessummaryResult" type="tns:postmalldailysalessummaryresponse" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="postmalldailysalessummaryresponse">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="header" type="tns:responseheader" />
        </s:sequence>
      </s:complexType>
      <s:element name="postesalescreate">
        <s:complexType>
          <s:sequence>
            <s:element maxOccurs="1" minOccurs="0" name="astr_request" type="tns:postesalescreaterequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="postesalescreaterequest">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="header" type="tns:requestheader" />
          <s:element maxOccurs="1" minOccurs="0" name="esalestotal" type="tns:esaleshdr" />
          <s:element maxOccurs="1" minOccurs="0" name="esalesitems" type="tns:ArrayOfEsalesitem" />
          <s:element maxOccurs="1" minOccurs="0" name="esalestenders" type="tns:ArrayOfEsalestender" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="esaleshdr">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="txdate_yyyymmdd" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="txtime_hhmmss" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="mallid" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="storecode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="tillid" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="txdocno" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="cashier" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="vipcode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="salesman" type="s:string" />
          <s:element maxOccurs="1" minOccurs="1" name="netqty" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="netamount" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="0" name="extendparam" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfEsalesitem">
        <s:sequence>
          <s:element maxOccurs="unbounded" minOccurs="0" name="esalesitem" nillable="true" type="tns:esalesitem" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="esalesitem">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="1" name="lineno" type="s:int" />
          <s:element maxOccurs="1" minOccurs="0" name="itemcode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="1" name="qty" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="discountamount" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="netamount" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="bonusearn" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="0" name="extendparam" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="salesitemremark" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfEsalestender">
        <s:sequence>
          <s:element maxOccurs="unbounded" minOccurs="0" name="esalestender" nillable="true" type="tns:esalestender" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="esalestender">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="1" name="lineno" type="s:int" />
          <s:element maxOccurs="1" minOccurs="0" name="tendercode" type="s:string" />
          <s:element maxOccurs="1" minOccurs="1" name="payamount" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="baseamount" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="1" name="excessamount" type="s:decimal" />
          <s:element maxOccurs="1" minOccurs="0" name="extendparam" type="s:string" />
          <s:element maxOccurs="1" minOccurs="0" name="remark" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="postesalescreateResponse">
        <s:complexType>
          <s:sequence>
            <s:element maxOccurs="1" minOccurs="0" name="postesalescreateResult" type="tns:postesalescreateresponse" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="postesalescreateresponse">
        <s:sequence>
          <s:element maxOccurs="1" minOccurs="0" name="header" type="tns:responseheader" />
        </s:sequence>
      </s:complexType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="test_a_plus_bSoapIn">
    <wsdl:part element="tns:test_a_plus_b" name="parameters">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="postdailysalessummarySoapIn">
    <wsdl:part element="tns:postdailysalessummary" name="parameters">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="postdailysalesestimatecreateSoapIn">
    <wsdl:part element="tns:postdailysalesestimatecreate" name="parameters">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="postsalescreateSoapOut">
    <wsdl:part element="tns:postsalescreateResponse" name="parameters">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="getcompanynameSoapIn">
    <wsdl:part element="tns:getcompanyname" name="parameters">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="postmalldailysalessummarySoapOut">
    <wsdl:part element="tns:postmalldailysalessummaryResponse" name="parameters">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="getversionSoapOut">
    <wsdl:part element="tns:getversionResponse" name="parameters">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="postesalescreateSoapIn">
    <wsdl:part element="tns:postesalescreate" name="parameters">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="getversionSoapIn">
    <wsdl:part element="tns:getversion" name="parameters">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="getcompanynameSoapOut">
    <wsdl:part element="tns:getcompanynameResponse" name="parameters">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="postdailysalessummarySoapOut">
    <wsdl:part element="tns:postdailysalessummaryResponse" name="parameters">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="test_a_plus_bSoapOut">
    <wsdl:part element="tns:test_a_plus_bResponse" name="parameters">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="postsalescreateSoapIn">
    <wsdl:part element="tns:postsalescreate" name="parameters">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="postesalescreateSoapOut">
    <wsdl:part element="tns:postesalescreateResponse" name="parameters">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="postmalldailysalessummarySoapIn">
    <wsdl:part element="tns:postmalldailysalessummary" name="parameters">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="postdailysalessummary2SoapOut">
    <wsdl:part element="tns:postdailysalessummary2Response" name="parameters">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="postdailysalessummary2SoapIn">
    <wsdl:part element="tns:postdailysalessummary2" name="parameters">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="postdailysalesestimatecreateSoapOut">
    <wsdl:part element="tns:postdailysalesestimatecreateResponse" name="parameters">
    </wsdl:part>
  </wsdl:message>
  <wsdl:portType name="salestransSoap">
    <wsdl:operation name="test_a_plus_b">
      <wsdl:input message="tns:test_a_plus_bSoapIn">
    </wsdl:input>
      <wsdl:output message="tns:test_a_plus_bSoapOut">
    </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="getversion">
      <wsdl:input message="tns:getversionSoapIn">
    </wsdl:input>
      <wsdl:output message="tns:getversionSoapOut">
    </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="getcompanyname">
      <wsdl:input message="tns:getcompanynameSoapIn">
    </wsdl:input>
      <wsdl:output message="tns:getcompanynameSoapOut">
    </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="postsalescreate">
      <wsdl:input message="tns:postsalescreateSoapIn">
    </wsdl:input>
      <wsdl:output message="tns:postsalescreateSoapOut">
    </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="postdailysalessummary">
      <wsdl:input message="tns:postdailysalessummarySoapIn">
    </wsdl:input>
      <wsdl:output message="tns:postdailysalessummarySoapOut">
    </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="postdailysalessummary2">
      <wsdl:input message="tns:postdailysalessummary2SoapIn">
    </wsdl:input>
      <wsdl:output message="tns:postdailysalessummary2SoapOut">
    </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="postdailysalesestimatecreate">
      <wsdl:input message="tns:postdailysalesestimatecreateSoapIn">
    </wsdl:input>
      <wsdl:output message="tns:postdailysalesestimatecreateSoapOut">
    </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="postmalldailysalessummary">
      <wsdl:input message="tns:postmalldailysalessummarySoapIn">
    </wsdl:input>
      <wsdl:output message="tns:postmalldailysalessummarySoapOut">
    </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="postesalescreate">
      <wsdl:input message="tns:postesalescreateSoapIn">
    </wsdl:input>
      <wsdl:output message="tns:postesalescreateSoapOut">
    </wsdl:output>
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="salestransSoap12" type="tns:salestransSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="test_a_plus_b">
      <soap12:operation soapAction="http://tempurl.org/test_a_plus_b" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="getversion">
      <soap12:operation soapAction="http://tempurl.org/getversion" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="getcompanyname">
      <soap12:operation soapAction="http://tempurl.org/getcompanyname" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="postsalescreate">
      <soap12:operation soapAction="http://tempurl.org/postsalescreate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="postdailysalessummary">
      <soap12:operation soapAction="http://tempurl.org/postdailysalessummary" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="postdailysalessummary2">
      <soap12:operation soapAction="http://tempurl.org/postdailysalessummary2" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="postdailysalesestimatecreate">
      <soap12:operation soapAction="http://tempurl.org/postdailysalesestimatecreate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="postmalldailysalessummary">
      <soap12:operation soapAction="http://tempurl.org/postmalldailysalessummary" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="postesalescreate">
      <soap12:operation soapAction="http://tempurl.org/postesalescreate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="salestransSoap" type="tns:salestransSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="test_a_plus_b">
      <soap:operation soapAction="http://tempurl.org/test_a_plus_b" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="getversion">
      <soap:operation soapAction="http://tempurl.org/getversion" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="getcompanyname">
      <soap:operation soapAction="http://tempurl.org/getcompanyname" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="postsalescreate">
      <soap:operation soapAction="http://tempurl.org/postsalescreate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="postdailysalessummary">
      <soap:operation soapAction="http://tempurl.org/postdailysalessummary" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="postdailysalessummary2">
      <soap:operation soapAction="http://tempurl.org/postdailysalessummary2" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="postdailysalesestimatecreate">
      <soap:operation soapAction="http://tempurl.org/postdailysalesestimatecreate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="postmalldailysalessummary">
      <soap:operation soapAction="http://tempurl.org/postmalldailysalessummary" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="postesalescreate">
      <soap:operation soapAction="http://tempurl.org/postesalescreate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="salestrans">
    <wsdl:port binding="tns:salestransSoap" name="salestransSoap">
      <soap:address location="https://ggwpos.hanglung.com.cn:8380/HLD/salestrans.asmx" />
    </wsdl:port>
    <wsdl:port binding="tns:salestransSoap12" name="salestransSoap12">
      <soap12:address location="https://ggwpos.hanglung.com.cn:8380/HLD/salestrans12.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>