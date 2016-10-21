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
 * A task assignment that is provided to an executor.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-10-21")
public class AssignedTask implements org.apache.thrift.TBase<AssignedTask, AssignedTask._Fields>, java.io.Serializable, Cloneable, Comparable<AssignedTask> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AssignedTask");

  private static final org.apache.thrift.protocol.TField TASK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("taskId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SLAVE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("slaveId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SLAVE_HOST_FIELD_DESC = new org.apache.thrift.protocol.TField("slaveHost", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TASK_FIELD_DESC = new org.apache.thrift.protocol.TField("task", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField ASSIGNED_PORTS_FIELD_DESC = new org.apache.thrift.protocol.TField("assignedPorts", org.apache.thrift.protocol.TType.MAP, (short)5);
  private static final org.apache.thrift.protocol.TField INSTANCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("instanceId", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AssignedTaskStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AssignedTaskTupleSchemeFactory());
  }

  /**
   * The mesos task ID for this task.  Guaranteed to be globally unique
   */
  public String taskId; // required
  /**
   * The mesos slave ID that this task has been assigned to.
   * This will not be populated for a PENDING task.
   */
  public String slaveId; // required
  /**
   * The name of the machine that this task has been assigned to.
   * This will not be populated for a PENDING task.
   */
  public String slaveHost; // required
  /**
   * Information about how to run this task.
   */
  public TaskConfig task; // required
  /**
   * Ports reserved on the machine while this task is running.
   */
  public Map<String,Integer> assignedPorts; // required
  /**
   * The instance ID assigned to this task. Instance IDs must be unique and contiguous within a
   * job, and will be in the range [0, N-1] (inclusive) for a job that has N instances.
   */
  public int instanceId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * The mesos task ID for this task.  Guaranteed to be globally unique
     */
    TASK_ID((short)1, "taskId"),
    /**
     * The mesos slave ID that this task has been assigned to.
     * This will not be populated for a PENDING task.
     */
    SLAVE_ID((short)2, "slaveId"),
    /**
     * The name of the machine that this task has been assigned to.
     * This will not be populated for a PENDING task.
     */
    SLAVE_HOST((short)3, "slaveHost"),
    /**
     * Information about how to run this task.
     */
    TASK((short)4, "task"),
    /**
     * Ports reserved on the machine while this task is running.
     */
    ASSIGNED_PORTS((short)5, "assignedPorts"),
    /**
     * The instance ID assigned to this task. Instance IDs must be unique and contiguous within a
     * job, and will be in the range [0, N-1] (inclusive) for a job that has N instances.
     */
    INSTANCE_ID((short)6, "instanceId");

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
        case 1: // TASK_ID
          return TASK_ID;
        case 2: // SLAVE_ID
          return SLAVE_ID;
        case 3: // SLAVE_HOST
          return SLAVE_HOST;
        case 4: // TASK
          return TASK;
        case 5: // ASSIGNED_PORTS
          return ASSIGNED_PORTS;
        case 6: // INSTANCE_ID
          return INSTANCE_ID;
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
  private static final int __INSTANCEID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASK_ID, new org.apache.thrift.meta_data.FieldMetaData("taskId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SLAVE_ID, new org.apache.thrift.meta_data.FieldMetaData("slaveId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SLAVE_HOST, new org.apache.thrift.meta_data.FieldMetaData("slaveHost", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TASK, new org.apache.thrift.meta_data.FieldMetaData("task", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TaskConfig.class)));
    tmpMap.put(_Fields.ASSIGNED_PORTS, new org.apache.thrift.meta_data.FieldMetaData("assignedPorts", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.INSTANCE_ID, new org.apache.thrift.meta_data.FieldMetaData("instanceId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AssignedTask.class, metaDataMap);
  }

  public AssignedTask() {
  }

  public AssignedTask(
    String taskId,
    String slaveId,
    String slaveHost,
    TaskConfig task,
    Map<String,Integer> assignedPorts,
    int instanceId)
  {
    this();
    this.taskId = taskId;
    this.slaveId = slaveId;
    this.slaveHost = slaveHost;
    this.task = task;
    this.assignedPorts = assignedPorts;
    this.instanceId = instanceId;
    setInstanceIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AssignedTask(AssignedTask other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTaskId()) {
      this.taskId = other.taskId;
    }
    if (other.isSetSlaveId()) {
      this.slaveId = other.slaveId;
    }
    if (other.isSetSlaveHost()) {
      this.slaveHost = other.slaveHost;
    }
    if (other.isSetTask()) {
      this.task = new TaskConfig(other.task);
    }
    if (other.isSetAssignedPorts()) {
      Map<String,Integer> __this__assignedPorts = new HashMap<String,Integer>(other.assignedPorts);
      this.assignedPorts = __this__assignedPorts;
    }
    this.instanceId = other.instanceId;
  }

  public AssignedTask deepCopy() {
    return new AssignedTask(this);
  }

  @Override
  public void clear() {
    this.taskId = null;
    this.slaveId = null;
    this.slaveHost = null;
    this.task = null;
    this.assignedPorts = null;
    setInstanceIdIsSet(false);
    this.instanceId = 0;
  }

  /**
   * The mesos task ID for this task.  Guaranteed to be globally unique
   */
  public String getTaskId() {
    return this.taskId;
  }

  /**
   * The mesos task ID for this task.  Guaranteed to be globally unique
   */
  public AssignedTask setTaskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  public void unsetTaskId() {
    this.taskId = null;
  }

  /** Returns true if field taskId is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskId() {
    return this.taskId != null;
  }

  public void setTaskIdIsSet(boolean value) {
    if (!value) {
      this.taskId = null;
    }
  }

  /**
   * The mesos slave ID that this task has been assigned to.
   * This will not be populated for a PENDING task.
   */
  public String getSlaveId() {
    return this.slaveId;
  }

  /**
   * The mesos slave ID that this task has been assigned to.
   * This will not be populated for a PENDING task.
   */
  public AssignedTask setSlaveId(String slaveId) {
    this.slaveId = slaveId;
    return this;
  }

  public void unsetSlaveId() {
    this.slaveId = null;
  }

  /** Returns true if field slaveId is set (has been assigned a value) and false otherwise */
  public boolean isSetSlaveId() {
    return this.slaveId != null;
  }

  public void setSlaveIdIsSet(boolean value) {
    if (!value) {
      this.slaveId = null;
    }
  }

  /**
   * The name of the machine that this task has been assigned to.
   * This will not be populated for a PENDING task.
   */
  public String getSlaveHost() {
    return this.slaveHost;
  }

  /**
   * The name of the machine that this task has been assigned to.
   * This will not be populated for a PENDING task.
   */
  public AssignedTask setSlaveHost(String slaveHost) {
    this.slaveHost = slaveHost;
    return this;
  }

  public void unsetSlaveHost() {
    this.slaveHost = null;
  }

  /** Returns true if field slaveHost is set (has been assigned a value) and false otherwise */
  public boolean isSetSlaveHost() {
    return this.slaveHost != null;
  }

  public void setSlaveHostIsSet(boolean value) {
    if (!value) {
      this.slaveHost = null;
    }
  }

  /**
   * Information about how to run this task.
   */
  public TaskConfig getTask() {
    return this.task;
  }

  /**
   * Information about how to run this task.
   */
  public AssignedTask setTask(TaskConfig task) {
    this.task = task;
    return this;
  }

  public void unsetTask() {
    this.task = null;
  }

  /** Returns true if field task is set (has been assigned a value) and false otherwise */
  public boolean isSetTask() {
    return this.task != null;
  }

  public void setTaskIsSet(boolean value) {
    if (!value) {
      this.task = null;
    }
  }

  public int getAssignedPortsSize() {
    return (this.assignedPorts == null) ? 0 : this.assignedPorts.size();
  }

  public void putToAssignedPorts(String key, int val) {
    if (this.assignedPorts == null) {
      this.assignedPorts = new HashMap<String,Integer>();
    }
    this.assignedPorts.put(key, val);
  }

  /**
   * Ports reserved on the machine while this task is running.
   */
  public Map<String,Integer> getAssignedPorts() {
    return this.assignedPorts;
  }

  /**
   * Ports reserved on the machine while this task is running.
   */
  public AssignedTask setAssignedPorts(Map<String,Integer> assignedPorts) {
    this.assignedPorts = assignedPorts;
    return this;
  }

  public void unsetAssignedPorts() {
    this.assignedPorts = null;
  }

  /** Returns true if field assignedPorts is set (has been assigned a value) and false otherwise */
  public boolean isSetAssignedPorts() {
    return this.assignedPorts != null;
  }

  public void setAssignedPortsIsSet(boolean value) {
    if (!value) {
      this.assignedPorts = null;
    }
  }

  /**
   * The instance ID assigned to this task. Instance IDs must be unique and contiguous within a
   * job, and will be in the range [0, N-1] (inclusive) for a job that has N instances.
   */
  public int getInstanceId() {
    return this.instanceId;
  }

  /**
   * The instance ID assigned to this task. Instance IDs must be unique and contiguous within a
   * job, and will be in the range [0, N-1] (inclusive) for a job that has N instances.
   */
  public AssignedTask setInstanceId(int instanceId) {
    this.instanceId = instanceId;
    setInstanceIdIsSet(true);
    return this;
  }

  public void unsetInstanceId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INSTANCEID_ISSET_ID);
  }

  /** Returns true if field instanceId is set (has been assigned a value) and false otherwise */
  public boolean isSetInstanceId() {
    return EncodingUtils.testBit(__isset_bitfield, __INSTANCEID_ISSET_ID);
  }

  public void setInstanceIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INSTANCEID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TASK_ID:
      if (value == null) {
        unsetTaskId();
      } else {
        setTaskId((String)value);
      }
      break;

    case SLAVE_ID:
      if (value == null) {
        unsetSlaveId();
      } else {
        setSlaveId((String)value);
      }
      break;

    case SLAVE_HOST:
      if (value == null) {
        unsetSlaveHost();
      } else {
        setSlaveHost((String)value);
      }
      break;

    case TASK:
      if (value == null) {
        unsetTask();
      } else {
        setTask((TaskConfig)value);
      }
      break;

    case ASSIGNED_PORTS:
      if (value == null) {
        unsetAssignedPorts();
      } else {
        setAssignedPorts((Map<String,Integer>)value);
      }
      break;

    case INSTANCE_ID:
      if (value == null) {
        unsetInstanceId();
      } else {
        setInstanceId((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TASK_ID:
      return getTaskId();

    case SLAVE_ID:
      return getSlaveId();

    case SLAVE_HOST:
      return getSlaveHost();

    case TASK:
      return getTask();

    case ASSIGNED_PORTS:
      return getAssignedPorts();

    case INSTANCE_ID:
      return getInstanceId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TASK_ID:
      return isSetTaskId();
    case SLAVE_ID:
      return isSetSlaveId();
    case SLAVE_HOST:
      return isSetSlaveHost();
    case TASK:
      return isSetTask();
    case ASSIGNED_PORTS:
      return isSetAssignedPorts();
    case INSTANCE_ID:
      return isSetInstanceId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AssignedTask)
      return this.equals((AssignedTask)that);
    return false;
  }

  public boolean equals(AssignedTask that) {
    if (that == null)
      return false;

    boolean this_present_taskId = true && this.isSetTaskId();
    boolean that_present_taskId = true && that.isSetTaskId();
    if (this_present_taskId || that_present_taskId) {
      if (!(this_present_taskId && that_present_taskId))
        return false;
      if (!this.taskId.equals(that.taskId))
        return false;
    }

    boolean this_present_slaveId = true && this.isSetSlaveId();
    boolean that_present_slaveId = true && that.isSetSlaveId();
    if (this_present_slaveId || that_present_slaveId) {
      if (!(this_present_slaveId && that_present_slaveId))
        return false;
      if (!this.slaveId.equals(that.slaveId))
        return false;
    }

    boolean this_present_slaveHost = true && this.isSetSlaveHost();
    boolean that_present_slaveHost = true && that.isSetSlaveHost();
    if (this_present_slaveHost || that_present_slaveHost) {
      if (!(this_present_slaveHost && that_present_slaveHost))
        return false;
      if (!this.slaveHost.equals(that.slaveHost))
        return false;
    }

    boolean this_present_task = true && this.isSetTask();
    boolean that_present_task = true && that.isSetTask();
    if (this_present_task || that_present_task) {
      if (!(this_present_task && that_present_task))
        return false;
      if (!this.task.equals(that.task))
        return false;
    }

    boolean this_present_assignedPorts = true && this.isSetAssignedPorts();
    boolean that_present_assignedPorts = true && that.isSetAssignedPorts();
    if (this_present_assignedPorts || that_present_assignedPorts) {
      if (!(this_present_assignedPorts && that_present_assignedPorts))
        return false;
      if (!this.assignedPorts.equals(that.assignedPorts))
        return false;
    }

    boolean this_present_instanceId = true;
    boolean that_present_instanceId = true;
    if (this_present_instanceId || that_present_instanceId) {
      if (!(this_present_instanceId && that_present_instanceId))
        return false;
      if (this.instanceId != that.instanceId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_taskId = true && (isSetTaskId());
    list.add(present_taskId);
    if (present_taskId)
      list.add(taskId);

    boolean present_slaveId = true && (isSetSlaveId());
    list.add(present_slaveId);
    if (present_slaveId)
      list.add(slaveId);

    boolean present_slaveHost = true && (isSetSlaveHost());
    list.add(present_slaveHost);
    if (present_slaveHost)
      list.add(slaveHost);

    boolean present_task = true && (isSetTask());
    list.add(present_task);
    if (present_task)
      list.add(task);

    boolean present_assignedPorts = true && (isSetAssignedPorts());
    list.add(present_assignedPorts);
    if (present_assignedPorts)
      list.add(assignedPorts);

    boolean present_instanceId = true;
    list.add(present_instanceId);
    if (present_instanceId)
      list.add(instanceId);

    return list.hashCode();
  }

  @Override
  public int compareTo(AssignedTask other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTaskId()).compareTo(other.isSetTaskId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskId, other.taskId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSlaveId()).compareTo(other.isSetSlaveId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSlaveId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.slaveId, other.slaveId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSlaveHost()).compareTo(other.isSetSlaveHost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSlaveHost()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.slaveHost, other.slaveHost);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTask()).compareTo(other.isSetTask());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTask()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.task, other.task);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAssignedPorts()).compareTo(other.isSetAssignedPorts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAssignedPorts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.assignedPorts, other.assignedPorts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInstanceId()).compareTo(other.isSetInstanceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInstanceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.instanceId, other.instanceId);
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
    StringBuilder sb = new StringBuilder("AssignedTask(");
    boolean first = true;

    sb.append("taskId:");
    if (this.taskId == null) {
      sb.append("null");
    } else {
      sb.append(this.taskId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("slaveId:");
    if (this.slaveId == null) {
      sb.append("null");
    } else {
      sb.append(this.slaveId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("slaveHost:");
    if (this.slaveHost == null) {
      sb.append("null");
    } else {
      sb.append(this.slaveHost);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("task:");
    if (this.task == null) {
      sb.append("null");
    } else {
      sb.append(this.task);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("assignedPorts:");
    if (this.assignedPorts == null) {
      sb.append("null");
    } else {
      sb.append(this.assignedPorts);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("instanceId:");
    sb.append(this.instanceId);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (task != null) {
      task.validate();
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

  private static class AssignedTaskStandardSchemeFactory implements SchemeFactory {
    public AssignedTaskStandardScheme getScheme() {
      return new AssignedTaskStandardScheme();
    }
  }

  private static class AssignedTaskStandardScheme extends StandardScheme<AssignedTask> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AssignedTask struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TASK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.taskId = iprot.readString();
              struct.setTaskIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SLAVE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.slaveId = iprot.readString();
              struct.setSlaveIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SLAVE_HOST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.slaveHost = iprot.readString();
              struct.setSlaveHostIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TASK
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.task = new TaskConfig();
              struct.task.read(iprot);
              struct.setTaskIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ASSIGNED_PORTS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map108 = iprot.readMapBegin();
                struct.assignedPorts = new HashMap<String,Integer>(2*_map108.size);
                String _key109;
                int _val110;
                for (int _i111 = 0; _i111 < _map108.size; ++_i111)
                {
                  _key109 = iprot.readString();
                  _val110 = iprot.readI32();
                  struct.assignedPorts.put(_key109, _val110);
                }
                iprot.readMapEnd();
              }
              struct.setAssignedPortsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // INSTANCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.instanceId = iprot.readI32();
              struct.setInstanceIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AssignedTask struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.taskId != null) {
        oprot.writeFieldBegin(TASK_ID_FIELD_DESC);
        oprot.writeString(struct.taskId);
        oprot.writeFieldEnd();
      }
      if (struct.slaveId != null) {
        oprot.writeFieldBegin(SLAVE_ID_FIELD_DESC);
        oprot.writeString(struct.slaveId);
        oprot.writeFieldEnd();
      }
      if (struct.slaveHost != null) {
        oprot.writeFieldBegin(SLAVE_HOST_FIELD_DESC);
        oprot.writeString(struct.slaveHost);
        oprot.writeFieldEnd();
      }
      if (struct.task != null) {
        oprot.writeFieldBegin(TASK_FIELD_DESC);
        struct.task.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.assignedPorts != null) {
        oprot.writeFieldBegin(ASSIGNED_PORTS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I32, struct.assignedPorts.size()));
          for (Map.Entry<String, Integer> _iter112 : struct.assignedPorts.entrySet())
          {
            oprot.writeString(_iter112.getKey());
            oprot.writeI32(_iter112.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(INSTANCE_ID_FIELD_DESC);
      oprot.writeI32(struct.instanceId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AssignedTaskTupleSchemeFactory implements SchemeFactory {
    public AssignedTaskTupleScheme getScheme() {
      return new AssignedTaskTupleScheme();
    }
  }

  private static class AssignedTaskTupleScheme extends TupleScheme<AssignedTask> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AssignedTask struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTaskId()) {
        optionals.set(0);
      }
      if (struct.isSetSlaveId()) {
        optionals.set(1);
      }
      if (struct.isSetSlaveHost()) {
        optionals.set(2);
      }
      if (struct.isSetTask()) {
        optionals.set(3);
      }
      if (struct.isSetAssignedPorts()) {
        optionals.set(4);
      }
      if (struct.isSetInstanceId()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetTaskId()) {
        oprot.writeString(struct.taskId);
      }
      if (struct.isSetSlaveId()) {
        oprot.writeString(struct.slaveId);
      }
      if (struct.isSetSlaveHost()) {
        oprot.writeString(struct.slaveHost);
      }
      if (struct.isSetTask()) {
        struct.task.write(oprot);
      }
      if (struct.isSetAssignedPorts()) {
        {
          oprot.writeI32(struct.assignedPorts.size());
          for (Map.Entry<String, Integer> _iter113 : struct.assignedPorts.entrySet())
          {
            oprot.writeString(_iter113.getKey());
            oprot.writeI32(_iter113.getValue());
          }
        }
      }
      if (struct.isSetInstanceId()) {
        oprot.writeI32(struct.instanceId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AssignedTask struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.taskId = iprot.readString();
        struct.setTaskIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.slaveId = iprot.readString();
        struct.setSlaveIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.slaveHost = iprot.readString();
        struct.setSlaveHostIsSet(true);
      }
      if (incoming.get(3)) {
        struct.task = new TaskConfig();
        struct.task.read(iprot);
        struct.setTaskIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TMap _map114 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.assignedPorts = new HashMap<String,Integer>(2*_map114.size);
          String _key115;
          int _val116;
          for (int _i117 = 0; _i117 < _map114.size; ++_i117)
          {
            _key115 = iprot.readString();
            _val116 = iprot.readI32();
            struct.assignedPorts.put(_key115, _val116);
          }
        }
        struct.setAssignedPortsIsSet(true);
      }
      if (incoming.get(5)) {
        struct.instanceId = iprot.readI32();
        struct.setInstanceIdIsSet(true);
      }
    }
  }

}

