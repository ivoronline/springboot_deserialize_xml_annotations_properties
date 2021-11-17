package com.ivoronline.springboot_deserialize_xml_annotations_properties.dto;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "person")
public class PersonDTO {

  //PROPERTIES
  @XmlAttribute(name = "personid"  ) public Integer id;
  @XmlElement  (name = "personname") public String  name;
  @XmlTransient                      public Integer age;

}
