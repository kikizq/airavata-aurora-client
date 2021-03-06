/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.cloud.aurora.client.sdk;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Describes an image to be used with the Mesos unified containerizer
 */
public class Image extends org.apache.thrift.TUnion<Image, Image._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Image");
  private static final org.apache.thrift.protocol.TField DOCKER_FIELD_DESC = new org.apache.thrift.protocol.TField("docker", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField APPC_FIELD_DESC = new org.apache.thrift.protocol.TField("appc", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DOCKER((short)1, "docker"),
    APPC((short)2, "appc");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DOCKER
          return DOCKER;
        case 2: // APPC
          return APPC;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DOCKER, new org.apache.thrift.meta_data.FieldMetaData("docker", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DockerImage.class)));
    tmpMap.put(_Fields.APPC, new org.apache.thrift.meta_data.FieldMetaData("appc", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AppcImage.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Image.class, metaDataMap);
  }

  public Image() {
    super();
  }

  public Image(_Fields setField, Object value) {
    super(setField, value);
  }

  public Image(Image other) {
    super(other);
  }
  public Image deepCopy() {
    return new Image(this);
  }

  public static Image docker(DockerImage value) {
    Image x = new Image();
    x.setDocker(value);
    return x;
  }

  public static Image appc(AppcImage value) {
    Image x = new Image();
    x.setAppc(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case DOCKER:
        if (value instanceof DockerImage) {
          break;
        }
        throw new ClassCastException("Was expecting value of type DockerImage for field 'docker', but got " + value.getClass().getSimpleName());
      case APPC:
        if (value instanceof AppcImage) {
          break;
        }
        throw new ClassCastException("Was expecting value of type AppcImage for field 'appc', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case DOCKER:
          if (field.type == DOCKER_FIELD_DESC.type) {
            DockerImage docker;
            docker = new DockerImage();
            docker.read(iprot);
            return docker;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case APPC:
          if (field.type == APPC_FIELD_DESC.type) {
            AppcImage appc;
            appc = new AppcImage();
            appc.read(iprot);
            return appc;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case DOCKER:
        DockerImage docker = (DockerImage)value_;
        docker.write(oprot);
        return;
      case APPC:
        AppcImage appc = (AppcImage)value_;
        appc.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case DOCKER:
          DockerImage docker;
          docker = new DockerImage();
          docker.read(iprot);
          return docker;
        case APPC:
          AppcImage appc;
          appc = new AppcImage();
          appc.read(iprot);
          return appc;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case DOCKER:
        DockerImage docker = (DockerImage)value_;
        docker.write(oprot);
        return;
      case APPC:
        AppcImage appc = (AppcImage)value_;
        appc.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case DOCKER:
        return DOCKER_FIELD_DESC;
      case APPC:
        return APPC_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public DockerImage getDocker() {
    if (getSetField() == _Fields.DOCKER) {
      return (DockerImage)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'docker' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDocker(DockerImage value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.DOCKER;
    value_ = value;
  }

  public AppcImage getAppc() {
    if (getSetField() == _Fields.APPC) {
      return (AppcImage)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'appc' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setAppc(AppcImage value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.APPC;
    value_ = value;
  }

  public boolean isSetDocker() {
    return setField_ == _Fields.DOCKER;
  }


  public boolean isSetAppc() {
    return setField_ == _Fields.APPC;
  }


  public boolean equals(Object other) {
    if (other instanceof Image) {
      return equals((Image)other);
    } else {
      return false;
    }
  }

  public boolean equals(Image other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(Image other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
