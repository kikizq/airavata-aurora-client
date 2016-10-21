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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-10-21")
public class GetJobUpdateDiffResult implements org.apache.thrift.TBase<GetJobUpdateDiffResult, GetJobUpdateDiffResult._Fields>, java.io.Serializable, Cloneable, Comparable<GetJobUpdateDiffResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetJobUpdateDiffResult");

  private static final org.apache.thrift.protocol.TField ADD_FIELD_DESC = new org.apache.thrift.protocol.TField("add", org.apache.thrift.protocol.TType.SET, (short)1);
  private static final org.apache.thrift.protocol.TField REMOVE_FIELD_DESC = new org.apache.thrift.protocol.TField("remove", org.apache.thrift.protocol.TType.SET, (short)2);
  private static final org.apache.thrift.protocol.TField UPDATE_FIELD_DESC = new org.apache.thrift.protocol.TField("update", org.apache.thrift.protocol.TType.SET, (short)3);
  private static final org.apache.thrift.protocol.TField UNCHANGED_FIELD_DESC = new org.apache.thrift.protocol.TField("unchanged", org.apache.thrift.protocol.TType.SET, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetJobUpdateDiffResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetJobUpdateDiffResultTupleSchemeFactory());
  }

  /**
   * Instance addition diff details.
   */
  public Set<ConfigGroup> add; // required
  /**
   * Instance removal diff details.
   */
  public Set<ConfigGroup> remove; // required
  /**
   * Instance update diff details.
   */
  public Set<ConfigGroup> update; // required
  /**
   * Instances unchanged by the update.
   */
  public Set<ConfigGroup> unchanged; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Instance addition diff details.
     */
    ADD((short)1, "add"),
    /**
     * Instance removal diff details.
     */
    REMOVE((short)2, "remove"),
    /**
     * Instance update diff details.
     */
    UPDATE((short)3, "update"),
    /**
     * Instances unchanged by the update.
     */
    UNCHANGED((short)4, "unchanged");

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
        case 1: // ADD
          return ADD;
        case 2: // REMOVE
          return REMOVE;
        case 3: // UPDATE
          return UPDATE;
        case 4: // UNCHANGED
          return UNCHANGED;
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

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ADD, new org.apache.thrift.meta_data.FieldMetaData("add", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ConfigGroup.class))));
    tmpMap.put(_Fields.REMOVE, new org.apache.thrift.meta_data.FieldMetaData("remove", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ConfigGroup.class))));
    tmpMap.put(_Fields.UPDATE, new org.apache.thrift.meta_data.FieldMetaData("update", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ConfigGroup.class))));
    tmpMap.put(_Fields.UNCHANGED, new org.apache.thrift.meta_data.FieldMetaData("unchanged", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ConfigGroup.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetJobUpdateDiffResult.class, metaDataMap);
  }

  public GetJobUpdateDiffResult() {
  }

  public GetJobUpdateDiffResult(
    Set<ConfigGroup> add,
    Set<ConfigGroup> remove,
    Set<ConfigGroup> update,
    Set<ConfigGroup> unchanged)
  {
    this();
    this.add = add;
    this.remove = remove;
    this.update = update;
    this.unchanged = unchanged;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetJobUpdateDiffResult(GetJobUpdateDiffResult other) {
    if (other.isSetAdd()) {
      Set<ConfigGroup> __this__add = new HashSet<ConfigGroup>(other.add.size());
      for (ConfigGroup other_element : other.add) {
        __this__add.add(new ConfigGroup(other_element));
      }
      this.add = __this__add;
    }
    if (other.isSetRemove()) {
      Set<ConfigGroup> __this__remove = new HashSet<ConfigGroup>(other.remove.size());
      for (ConfigGroup other_element : other.remove) {
        __this__remove.add(new ConfigGroup(other_element));
      }
      this.remove = __this__remove;
    }
    if (other.isSetUpdate()) {
      Set<ConfigGroup> __this__update = new HashSet<ConfigGroup>(other.update.size());
      for (ConfigGroup other_element : other.update) {
        __this__update.add(new ConfigGroup(other_element));
      }
      this.update = __this__update;
    }
    if (other.isSetUnchanged()) {
      Set<ConfigGroup> __this__unchanged = new HashSet<ConfigGroup>(other.unchanged.size());
      for (ConfigGroup other_element : other.unchanged) {
        __this__unchanged.add(new ConfigGroup(other_element));
      }
      this.unchanged = __this__unchanged;
    }
  }

  public GetJobUpdateDiffResult deepCopy() {
    return new GetJobUpdateDiffResult(this);
  }

  @Override
  public void clear() {
    this.add = null;
    this.remove = null;
    this.update = null;
    this.unchanged = null;
  }

  public int getAddSize() {
    return (this.add == null) ? 0 : this.add.size();
  }

  public java.util.Iterator<ConfigGroup> getAddIterator() {
    return (this.add == null) ? null : this.add.iterator();
  }

  public void addToAdd(ConfigGroup elem) {
    if (this.add == null) {
      this.add = new HashSet<ConfigGroup>();
    }
    this.add.add(elem);
  }

  /**
   * Instance addition diff details.
   */
  public Set<ConfigGroup> getAdd() {
    return this.add;
  }

  /**
   * Instance addition diff details.
   */
  public GetJobUpdateDiffResult setAdd(Set<ConfigGroup> add) {
    this.add = add;
    return this;
  }

  public void unsetAdd() {
    this.add = null;
  }

  /** Returns true if field add is set (has been assigned a value) and false otherwise */
  public boolean isSetAdd() {
    return this.add != null;
  }

  public void setAddIsSet(boolean value) {
    if (!value) {
      this.add = null;
    }
  }

  public int getRemoveSize() {
    return (this.remove == null) ? 0 : this.remove.size();
  }

  public java.util.Iterator<ConfigGroup> getRemoveIterator() {
    return (this.remove == null) ? null : this.remove.iterator();
  }

  public void addToRemove(ConfigGroup elem) {
    if (this.remove == null) {
      this.remove = new HashSet<ConfigGroup>();
    }
    this.remove.add(elem);
  }

  /**
   * Instance removal diff details.
   */
  public Set<ConfigGroup> getRemove() {
    return this.remove;
  }

  /**
   * Instance removal diff details.
   */
  public GetJobUpdateDiffResult setRemove(Set<ConfigGroup> remove) {
    this.remove = remove;
    return this;
  }

  public void unsetRemove() {
    this.remove = null;
  }

  /** Returns true if field remove is set (has been assigned a value) and false otherwise */
  public boolean isSetRemove() {
    return this.remove != null;
  }

  public void setRemoveIsSet(boolean value) {
    if (!value) {
      this.remove = null;
    }
  }

  public int getUpdateSize() {
    return (this.update == null) ? 0 : this.update.size();
  }

  public java.util.Iterator<ConfigGroup> getUpdateIterator() {
    return (this.update == null) ? null : this.update.iterator();
  }

  public void addToUpdate(ConfigGroup elem) {
    if (this.update == null) {
      this.update = new HashSet<ConfigGroup>();
    }
    this.update.add(elem);
  }

  /**
   * Instance update diff details.
   */
  public Set<ConfigGroup> getUpdate() {
    return this.update;
  }

  /**
   * Instance update diff details.
   */
  public GetJobUpdateDiffResult setUpdate(Set<ConfigGroup> update) {
    this.update = update;
    return this;
  }

  public void unsetUpdate() {
    this.update = null;
  }

  /** Returns true if field update is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdate() {
    return this.update != null;
  }

  public void setUpdateIsSet(boolean value) {
    if (!value) {
      this.update = null;
    }
  }

  public int getUnchangedSize() {
    return (this.unchanged == null) ? 0 : this.unchanged.size();
  }

  public java.util.Iterator<ConfigGroup> getUnchangedIterator() {
    return (this.unchanged == null) ? null : this.unchanged.iterator();
  }

  public void addToUnchanged(ConfigGroup elem) {
    if (this.unchanged == null) {
      this.unchanged = new HashSet<ConfigGroup>();
    }
    this.unchanged.add(elem);
  }

  /**
   * Instances unchanged by the update.
   */
  public Set<ConfigGroup> getUnchanged() {
    return this.unchanged;
  }

  /**
   * Instances unchanged by the update.
   */
  public GetJobUpdateDiffResult setUnchanged(Set<ConfigGroup> unchanged) {
    this.unchanged = unchanged;
    return this;
  }

  public void unsetUnchanged() {
    this.unchanged = null;
  }

  /** Returns true if field unchanged is set (has been assigned a value) and false otherwise */
  public boolean isSetUnchanged() {
    return this.unchanged != null;
  }

  public void setUnchangedIsSet(boolean value) {
    if (!value) {
      this.unchanged = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ADD:
      if (value == null) {
        unsetAdd();
      } else {
        setAdd((Set<ConfigGroup>)value);
      }
      break;

    case REMOVE:
      if (value == null) {
        unsetRemove();
      } else {
        setRemove((Set<ConfigGroup>)value);
      }
      break;

    case UPDATE:
      if (value == null) {
        unsetUpdate();
      } else {
        setUpdate((Set<ConfigGroup>)value);
      }
      break;

    case UNCHANGED:
      if (value == null) {
        unsetUnchanged();
      } else {
        setUnchanged((Set<ConfigGroup>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ADD:
      return getAdd();

    case REMOVE:
      return getRemove();

    case UPDATE:
      return getUpdate();

    case UNCHANGED:
      return getUnchanged();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ADD:
      return isSetAdd();
    case REMOVE:
      return isSetRemove();
    case UPDATE:
      return isSetUpdate();
    case UNCHANGED:
      return isSetUnchanged();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetJobUpdateDiffResult)
      return this.equals((GetJobUpdateDiffResult)that);
    return false;
  }

  public boolean equals(GetJobUpdateDiffResult that) {
    if (that == null)
      return false;

    boolean this_present_add = true && this.isSetAdd();
    boolean that_present_add = true && that.isSetAdd();
    if (this_present_add || that_present_add) {
      if (!(this_present_add && that_present_add))
        return false;
      if (!this.add.equals(that.add))
        return false;
    }

    boolean this_present_remove = true && this.isSetRemove();
    boolean that_present_remove = true && that.isSetRemove();
    if (this_present_remove || that_present_remove) {
      if (!(this_present_remove && that_present_remove))
        return false;
      if (!this.remove.equals(that.remove))
        return false;
    }

    boolean this_present_update = true && this.isSetUpdate();
    boolean that_present_update = true && that.isSetUpdate();
    if (this_present_update || that_present_update) {
      if (!(this_present_update && that_present_update))
        return false;
      if (!this.update.equals(that.update))
        return false;
    }

    boolean this_present_unchanged = true && this.isSetUnchanged();
    boolean that_present_unchanged = true && that.isSetUnchanged();
    if (this_present_unchanged || that_present_unchanged) {
      if (!(this_present_unchanged && that_present_unchanged))
        return false;
      if (!this.unchanged.equals(that.unchanged))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_add = true && (isSetAdd());
    list.add(present_add);
    if (present_add)
      list.add(add);

    boolean present_remove = true && (isSetRemove());
    list.add(present_remove);
    if (present_remove)
      list.add(remove);

    boolean present_update = true && (isSetUpdate());
    list.add(present_update);
    if (present_update)
      list.add(update);

    boolean present_unchanged = true && (isSetUnchanged());
    list.add(present_unchanged);
    if (present_unchanged)
      list.add(unchanged);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetJobUpdateDiffResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAdd()).compareTo(other.isSetAdd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.add, other.add);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRemove()).compareTo(other.isSetRemove());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRemove()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.remove, other.remove);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdate()).compareTo(other.isSetUpdate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.update, other.update);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnchanged()).compareTo(other.isSetUnchanged());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnchanged()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unchanged, other.unchanged);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetJobUpdateDiffResult(");
    boolean first = true;

    sb.append("add:");
    if (this.add == null) {
      sb.append("null");
    } else {
      sb.append(this.add);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("remove:");
    if (this.remove == null) {
      sb.append("null");
    } else {
      sb.append(this.remove);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("update:");
    if (this.update == null) {
      sb.append("null");
    } else {
      sb.append(this.update);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("unchanged:");
    if (this.unchanged == null) {
      sb.append("null");
    } else {
      sb.append(this.unchanged);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class GetJobUpdateDiffResultStandardSchemeFactory implements SchemeFactory {
    public GetJobUpdateDiffResultStandardScheme getScheme() {
      return new GetJobUpdateDiffResultStandardScheme();
    }
  }

  private static class GetJobUpdateDiffResultStandardScheme extends StandardScheme<GetJobUpdateDiffResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetJobUpdateDiffResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ADD
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set342 = iprot.readSetBegin();
                struct.add = new HashSet<ConfigGroup>(2*_set342.size);
                ConfigGroup _elem343;
                for (int _i344 = 0; _i344 < _set342.size; ++_i344)
                {
                  _elem343 = new ConfigGroup();
                  _elem343.read(iprot);
                  struct.add.add(_elem343);
                }
                iprot.readSetEnd();
              }
              struct.setAddIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REMOVE
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set345 = iprot.readSetBegin();
                struct.remove = new HashSet<ConfigGroup>(2*_set345.size);
                ConfigGroup _elem346;
                for (int _i347 = 0; _i347 < _set345.size; ++_i347)
                {
                  _elem346 = new ConfigGroup();
                  _elem346.read(iprot);
                  struct.remove.add(_elem346);
                }
                iprot.readSetEnd();
              }
              struct.setRemoveIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UPDATE
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set348 = iprot.readSetBegin();
                struct.update = new HashSet<ConfigGroup>(2*_set348.size);
                ConfigGroup _elem349;
                for (int _i350 = 0; _i350 < _set348.size; ++_i350)
                {
                  _elem349 = new ConfigGroup();
                  _elem349.read(iprot);
                  struct.update.add(_elem349);
                }
                iprot.readSetEnd();
              }
              struct.setUpdateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // UNCHANGED
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set351 = iprot.readSetBegin();
                struct.unchanged = new HashSet<ConfigGroup>(2*_set351.size);
                ConfigGroup _elem352;
                for (int _i353 = 0; _i353 < _set351.size; ++_i353)
                {
                  _elem352 = new ConfigGroup();
                  _elem352.read(iprot);
                  struct.unchanged.add(_elem352);
                }
                iprot.readSetEnd();
              }
              struct.setUnchangedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetJobUpdateDiffResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.add != null) {
        oprot.writeFieldBegin(ADD_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.add.size()));
          for (ConfigGroup _iter354 : struct.add)
          {
            _iter354.write(oprot);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.remove != null) {
        oprot.writeFieldBegin(REMOVE_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.remove.size()));
          for (ConfigGroup _iter355 : struct.remove)
          {
            _iter355.write(oprot);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.update != null) {
        oprot.writeFieldBegin(UPDATE_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.update.size()));
          for (ConfigGroup _iter356 : struct.update)
          {
            _iter356.write(oprot);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.unchanged != null) {
        oprot.writeFieldBegin(UNCHANGED_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.unchanged.size()));
          for (ConfigGroup _iter357 : struct.unchanged)
          {
            _iter357.write(oprot);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetJobUpdateDiffResultTupleSchemeFactory implements SchemeFactory {
    public GetJobUpdateDiffResultTupleScheme getScheme() {
      return new GetJobUpdateDiffResultTupleScheme();
    }
  }

  private static class GetJobUpdateDiffResultTupleScheme extends TupleScheme<GetJobUpdateDiffResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetJobUpdateDiffResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAdd()) {
        optionals.set(0);
      }
      if (struct.isSetRemove()) {
        optionals.set(1);
      }
      if (struct.isSetUpdate()) {
        optionals.set(2);
      }
      if (struct.isSetUnchanged()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetAdd()) {
        {
          oprot.writeI32(struct.add.size());
          for (ConfigGroup _iter358 : struct.add)
          {
            _iter358.write(oprot);
          }
        }
      }
      if (struct.isSetRemove()) {
        {
          oprot.writeI32(struct.remove.size());
          for (ConfigGroup _iter359 : struct.remove)
          {
            _iter359.write(oprot);
          }
        }
      }
      if (struct.isSetUpdate()) {
        {
          oprot.writeI32(struct.update.size());
          for (ConfigGroup _iter360 : struct.update)
          {
            _iter360.write(oprot);
          }
        }
      }
      if (struct.isSetUnchanged()) {
        {
          oprot.writeI32(struct.unchanged.size());
          for (ConfigGroup _iter361 : struct.unchanged)
          {
            _iter361.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetJobUpdateDiffResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TSet _set362 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.add = new HashSet<ConfigGroup>(2*_set362.size);
          ConfigGroup _elem363;
          for (int _i364 = 0; _i364 < _set362.size; ++_i364)
          {
            _elem363 = new ConfigGroup();
            _elem363.read(iprot);
            struct.add.add(_elem363);
          }
        }
        struct.setAddIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TSet _set365 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.remove = new HashSet<ConfigGroup>(2*_set365.size);
          ConfigGroup _elem366;
          for (int _i367 = 0; _i367 < _set365.size; ++_i367)
          {
            _elem366 = new ConfigGroup();
            _elem366.read(iprot);
            struct.remove.add(_elem366);
          }
        }
        struct.setRemoveIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TSet _set368 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.update = new HashSet<ConfigGroup>(2*_set368.size);
          ConfigGroup _elem369;
          for (int _i370 = 0; _i370 < _set368.size; ++_i370)
          {
            _elem369 = new ConfigGroup();
            _elem369.read(iprot);
            struct.update.add(_elem369);
          }
        }
        struct.setUpdateIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TSet _set371 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.unchanged = new HashSet<ConfigGroup>(2*_set371.size);
          ConfigGroup _elem372;
          for (int _i373 = 0; _i373 < _set371.size; ++_i373)
          {
            _elem372 = new ConfigGroup();
            _elem372.read(iprot);
            struct.unchanged.add(_elem372);
          }
        }
        struct.setUnchangedIsSet(true);
      }
    }
  }

}

