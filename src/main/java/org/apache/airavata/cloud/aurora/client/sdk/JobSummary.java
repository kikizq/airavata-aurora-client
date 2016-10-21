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
public class JobSummary implements org.apache.thrift.TBase<JobSummary, JobSummary._Fields>, java.io.Serializable, Cloneable, Comparable<JobSummary> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobSummary");

  private static final org.apache.thrift.protocol.TField JOB_FIELD_DESC = new org.apache.thrift.protocol.TField("job", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("stats", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField NEXT_CRON_RUN_MS_FIELD_DESC = new org.apache.thrift.protocol.TField("nextCronRunMs", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobSummaryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new JobSummaryTupleSchemeFactory());
  }

  public JobConfiguration job; // required
  public JobStats stats; // required
  /**
   * Timestamp of next cron run in ms since epoch, for a cron job
   */
  public long nextCronRunMs; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOB((short)1, "job"),
    STATS((short)2, "stats"),
    /**
     * Timestamp of next cron run in ms since epoch, for a cron job
     */
    NEXT_CRON_RUN_MS((short)3, "nextCronRunMs");

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
        case 1: // JOB
          return JOB;
        case 2: // STATS
          return STATS;
        case 3: // NEXT_CRON_RUN_MS
          return NEXT_CRON_RUN_MS;
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
  private static final int __NEXTCRONRUNMS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NEXT_CRON_RUN_MS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB, new org.apache.thrift.meta_data.FieldMetaData("job", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JobConfiguration.class)));
    tmpMap.put(_Fields.STATS, new org.apache.thrift.meta_data.FieldMetaData("stats", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JobStats.class)));
    tmpMap.put(_Fields.NEXT_CRON_RUN_MS, new org.apache.thrift.meta_data.FieldMetaData("nextCronRunMs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobSummary.class, metaDataMap);
  }

  public JobSummary() {
  }

  public JobSummary(
    JobConfiguration job,
    JobStats stats)
  {
    this();
    this.job = job;
    this.stats = stats;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobSummary(JobSummary other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetJob()) {
      this.job = new JobConfiguration(other.job);
    }
    if (other.isSetStats()) {
      this.stats = new JobStats(other.stats);
    }
    this.nextCronRunMs = other.nextCronRunMs;
  }

  public JobSummary deepCopy() {
    return new JobSummary(this);
  }

  @Override
  public void clear() {
    this.job = null;
    this.stats = null;
    setNextCronRunMsIsSet(false);
    this.nextCronRunMs = 0;
  }

  public JobConfiguration getJob() {
    return this.job;
  }

  public JobSummary setJob(JobConfiguration job) {
    this.job = job;
    return this;
  }

  public void unsetJob() {
    this.job = null;
  }

  /** Returns true if field job is set (has been assigned a value) and false otherwise */
  public boolean isSetJob() {
    return this.job != null;
  }

  public void setJobIsSet(boolean value) {
    if (!value) {
      this.job = null;
    }
  }

  public JobStats getStats() {
    return this.stats;
  }

  public JobSummary setStats(JobStats stats) {
    this.stats = stats;
    return this;
  }

  public void unsetStats() {
    this.stats = null;
  }

  /** Returns true if field stats is set (has been assigned a value) and false otherwise */
  public boolean isSetStats() {
    return this.stats != null;
  }

  public void setStatsIsSet(boolean value) {
    if (!value) {
      this.stats = null;
    }
  }

  /**
   * Timestamp of next cron run in ms since epoch, for a cron job
   */
  public long getNextCronRunMs() {
    return this.nextCronRunMs;
  }

  /**
   * Timestamp of next cron run in ms since epoch, for a cron job
   */
  public JobSummary setNextCronRunMs(long nextCronRunMs) {
    this.nextCronRunMs = nextCronRunMs;
    setNextCronRunMsIsSet(true);
    return this;
  }

  public void unsetNextCronRunMs() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NEXTCRONRUNMS_ISSET_ID);
  }

  /** Returns true if field nextCronRunMs is set (has been assigned a value) and false otherwise */
  public boolean isSetNextCronRunMs() {
    return EncodingUtils.testBit(__isset_bitfield, __NEXTCRONRUNMS_ISSET_ID);
  }

  public void setNextCronRunMsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NEXTCRONRUNMS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB:
      if (value == null) {
        unsetJob();
      } else {
        setJob((JobConfiguration)value);
      }
      break;

    case STATS:
      if (value == null) {
        unsetStats();
      } else {
        setStats((JobStats)value);
      }
      break;

    case NEXT_CRON_RUN_MS:
      if (value == null) {
        unsetNextCronRunMs();
      } else {
        setNextCronRunMs((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB:
      return getJob();

    case STATS:
      return getStats();

    case NEXT_CRON_RUN_MS:
      return getNextCronRunMs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB:
      return isSetJob();
    case STATS:
      return isSetStats();
    case NEXT_CRON_RUN_MS:
      return isSetNextCronRunMs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobSummary)
      return this.equals((JobSummary)that);
    return false;
  }

  public boolean equals(JobSummary that) {
    if (that == null)
      return false;

    boolean this_present_job = true && this.isSetJob();
    boolean that_present_job = true && that.isSetJob();
    if (this_present_job || that_present_job) {
      if (!(this_present_job && that_present_job))
        return false;
      if (!this.job.equals(that.job))
        return false;
    }

    boolean this_present_stats = true && this.isSetStats();
    boolean that_present_stats = true && that.isSetStats();
    if (this_present_stats || that_present_stats) {
      if (!(this_present_stats && that_present_stats))
        return false;
      if (!this.stats.equals(that.stats))
        return false;
    }

    boolean this_present_nextCronRunMs = true && this.isSetNextCronRunMs();
    boolean that_present_nextCronRunMs = true && that.isSetNextCronRunMs();
    if (this_present_nextCronRunMs || that_present_nextCronRunMs) {
      if (!(this_present_nextCronRunMs && that_present_nextCronRunMs))
        return false;
      if (this.nextCronRunMs != that.nextCronRunMs)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_job = true && (isSetJob());
    list.add(present_job);
    if (present_job)
      list.add(job);

    boolean present_stats = true && (isSetStats());
    list.add(present_stats);
    if (present_stats)
      list.add(stats);

    boolean present_nextCronRunMs = true && (isSetNextCronRunMs());
    list.add(present_nextCronRunMs);
    if (present_nextCronRunMs)
      list.add(nextCronRunMs);

    return list.hashCode();
  }

  @Override
  public int compareTo(JobSummary other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetJob()).compareTo(other.isSetJob());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJob()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.job, other.job);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStats()).compareTo(other.isSetStats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stats, other.stats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNextCronRunMs()).compareTo(other.isSetNextCronRunMs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNextCronRunMs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nextCronRunMs, other.nextCronRunMs);
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
    StringBuilder sb = new StringBuilder("JobSummary(");
    boolean first = true;

    sb.append("job:");
    if (this.job == null) {
      sb.append("null");
    } else {
      sb.append(this.job);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stats:");
    if (this.stats == null) {
      sb.append("null");
    } else {
      sb.append(this.stats);
    }
    first = false;
    if (isSetNextCronRunMs()) {
      if (!first) sb.append(", ");
      sb.append("nextCronRunMs:");
      sb.append(this.nextCronRunMs);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (job != null) {
      job.validate();
    }
    if (stats != null) {
      stats.validate();
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JobSummaryStandardSchemeFactory implements SchemeFactory {
    public JobSummaryStandardScheme getScheme() {
      return new JobSummaryStandardScheme();
    }
  }

  private static class JobSummaryStandardScheme extends StandardScheme<JobSummary> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobSummary struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.job = new JobConfiguration();
              struct.job.read(iprot);
              struct.setJobIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stats = new JobStats();
              struct.stats.read(iprot);
              struct.setStatsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NEXT_CRON_RUN_MS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.nextCronRunMs = iprot.readI64();
              struct.setNextCronRunMsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobSummary struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.job != null) {
        oprot.writeFieldBegin(JOB_FIELD_DESC);
        struct.job.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.stats != null) {
        oprot.writeFieldBegin(STATS_FIELD_DESC);
        struct.stats.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetNextCronRunMs()) {
        oprot.writeFieldBegin(NEXT_CRON_RUN_MS_FIELD_DESC);
        oprot.writeI64(struct.nextCronRunMs);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobSummaryTupleSchemeFactory implements SchemeFactory {
    public JobSummaryTupleScheme getScheme() {
      return new JobSummaryTupleScheme();
    }
  }

  private static class JobSummaryTupleScheme extends TupleScheme<JobSummary> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JobSummary struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetJob()) {
        optionals.set(0);
      }
      if (struct.isSetStats()) {
        optionals.set(1);
      }
      if (struct.isSetNextCronRunMs()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetJob()) {
        struct.job.write(oprot);
      }
      if (struct.isSetStats()) {
        struct.stats.write(oprot);
      }
      if (struct.isSetNextCronRunMs()) {
        oprot.writeI64(struct.nextCronRunMs);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JobSummary struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.job = new JobConfiguration();
        struct.job.read(iprot);
        struct.setJobIsSet(true);
      }
      if (incoming.get(1)) {
        struct.stats = new JobStats();
        struct.stats.read(iprot);
        struct.setStatsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.nextCronRunMs = iprot.readI64();
        struct.setNextCronRunMsIsSet(true);
      }
    }
  }

}

