/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.honu.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

public class TChunk implements TBase, java.io.Serializable, Cloneable, Comparable<TChunk> {
  private static final TStruct STRUCT_DESC = new TStruct("TChunk");
  private static final TField SOURCE_FIELD_DESC = new TField("source", TType.STRING, (short)1);
  private static final TField STREAM_NAME_FIELD_DESC = new TField("streamName", TType.STRING, (short)2);
  private static final TField APPLICATION_FIELD_DESC = new TField("application", TType.STRING, (short)3);
  private static final TField DATA_TYPE_FIELD_DESC = new TField("dataType", TType.STRING, (short)4);
  private static final TField TAGS_FIELD_DESC = new TField("tags", TType.STRING, (short)5);
  private static final TField SEQ_ID_FIELD_DESC = new TField("seqId", TType.I64, (short)6);
  private static final TField LOG_EVENTS_FIELD_DESC = new TField("logEvents", TType.LIST, (short)7);

  private String source;
  private String streamName;
  private String application;
  private String dataType;
  private String tags;
  private long seqId;
  private List<String> logEvents;
  public static final int SOURCE = 1;
  public static final int STREAMNAME = 2;
  public static final int APPLICATION = 3;
  public static final int DATATYPE = 4;
  public static final int TAGS = 5;
  public static final int SEQID = 6;
  public static final int LOGEVENTS = 7;

  // isset id assignments
  private static final int __SEQID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(SOURCE, new FieldMetaData("source", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(STREAMNAME, new FieldMetaData("streamName", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(APPLICATION, new FieldMetaData("application", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(DATATYPE, new FieldMetaData("dataType", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(TAGS, new FieldMetaData("tags", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(SEQID, new FieldMetaData("seqId", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    put(LOGEVENTS, new FieldMetaData("logEvents", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(TChunk.class, metaDataMap);
  }

  public static final Map<String, Integer> fieldNameMap = Collections.unmodifiableMap(new HashMap<String, Integer>() {{
    put("source", new Integer(SOURCE));
    put("streamName", new Integer(STREAMNAME));
    put("application", new Integer(APPLICATION));
    put("dataType", new Integer(DATATYPE));
    put("tags", new Integer(TAGS));
    put("seqId", new Integer(SEQID));
    put("logEvents", new Integer(LOGEVENTS));
  }});

  public TChunk() {
  }

  public TChunk(
    String source,
    String streamName,
    String application,
    String dataType,
    String tags,
    long seqId,
    List<String> logEvents)
  {
    this();
    this.source = source;
    this.streamName = streamName;
    this.application = application;
    this.dataType = dataType;
    this.tags = tags;
    this.seqId = seqId;
    setSeqIdIsSet(true);
    this.logEvents = logEvents;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TChunk(TChunk other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetSource()) {
      this.source = other.source;
    }
    if (other.isSetStreamName()) {
      this.streamName = other.streamName;
    }
    if (other.isSetApplication()) {
      this.application = other.application;
    }
    if (other.isSetDataType()) {
      this.dataType = other.dataType;
    }
    if (other.isSetTags()) {
      this.tags = other.tags;
    }
    this.seqId = other.seqId;
    if (other.isSetLogEvents()) {
      List<String> __this__logEvents = new ArrayList<String>();
      for (String other_element : other.logEvents) {
        __this__logEvents.add(other_element);
      }
      this.logEvents = __this__logEvents;
    }
  }

  public TChunk deepCopy() {
    return new TChunk(this);
  }

  @Deprecated
  public TChunk clone() {
    return new TChunk(this);
  }

  public String getSource() {
    return this.source;
  }

  public TChunk setSource(String source) {
    this.source = source;
    return this;
  }

  public void unsetSource() {
    this.source = null;
  }

  // Returns true if field source is set (has been asigned a value) and false otherwise
  public boolean isSetSource() {
    return this.source != null;
  }

  public void setSourceIsSet(boolean value) {
    if (!value) {
      this.source = null;
    }
  }

  public String getStreamName() {
    return this.streamName;
  }

  public TChunk setStreamName(String streamName) {
    this.streamName = streamName;
    return this;
  }

  public void unsetStreamName() {
    this.streamName = null;
  }

  // Returns true if field streamName is set (has been asigned a value) and false otherwise
  public boolean isSetStreamName() {
    return this.streamName != null;
  }

  public void setStreamNameIsSet(boolean value) {
    if (!value) {
      this.streamName = null;
    }
  }

  public String getApplication() {
    return this.application;
  }

  public TChunk setApplication(String application) {
    this.application = application;
    return this;
  }

  public void unsetApplication() {
    this.application = null;
  }

  // Returns true if field application is set (has been asigned a value) and false otherwise
  public boolean isSetApplication() {
    return this.application != null;
  }

  public void setApplicationIsSet(boolean value) {
    if (!value) {
      this.application = null;
    }
  }

  public String getDataType() {
    return this.dataType;
  }

  public TChunk setDataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

  public void unsetDataType() {
    this.dataType = null;
  }

  // Returns true if field dataType is set (has been asigned a value) and false otherwise
  public boolean isSetDataType() {
    return this.dataType != null;
  }

  public void setDataTypeIsSet(boolean value) {
    if (!value) {
      this.dataType = null;
    }
  }

  public String getTags() {
    return this.tags;
  }

  public TChunk setTags(String tags) {
    this.tags = tags;
    return this;
  }

  public void unsetTags() {
    this.tags = null;
  }

  // Returns true if field tags is set (has been asigned a value) and false otherwise
  public boolean isSetTags() {
    return this.tags != null;
  }

  public void setTagsIsSet(boolean value) {
    if (!value) {
      this.tags = null;
    }
  }

  public long getSeqId() {
    return this.seqId;
  }

  public TChunk setSeqId(long seqId) {
    this.seqId = seqId;
    setSeqIdIsSet(true);
    return this;
  }

  public void unsetSeqId() {
    __isset_bit_vector.clear(__SEQID_ISSET_ID);
  }

  // Returns true if field seqId is set (has been asigned a value) and false otherwise
  public boolean isSetSeqId() {
    return __isset_bit_vector.get(__SEQID_ISSET_ID);
  }

  public void setSeqIdIsSet(boolean value) {
    __isset_bit_vector.set(__SEQID_ISSET_ID, value);
  }

  public int getLogEventsSize() {
    return (this.logEvents == null) ? 0 : this.logEvents.size();
  }

  public java.util.Iterator<String> getLogEventsIterator() {
    return (this.logEvents == null) ? null : this.logEvents.iterator();
  }

  public void addToLogEvents(String elem) {
    if (this.logEvents == null) {
      this.logEvents = new ArrayList<String>();
    }
    this.logEvents.add(elem);
  }

  public List<String> getLogEvents() {
    return this.logEvents;
  }

  public TChunk setLogEvents(List<String> logEvents) {
    this.logEvents = logEvents;
    return this;
  }

  public void unsetLogEvents() {
    this.logEvents = null;
  }

  // Returns true if field logEvents is set (has been asigned a value) and false otherwise
  public boolean isSetLogEvents() {
    return this.logEvents != null;
  }

  public void setLogEventsIsSet(boolean value) {
    if (!value) {
      this.logEvents = null;
    }
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case SOURCE:
      if (value == null) {
        unsetSource();
      } else {
        setSource((String)value);
      }
      break;

    case STREAMNAME:
      if (value == null) {
        unsetStreamName();
      } else {
        setStreamName((String)value);
      }
      break;

    case APPLICATION:
      if (value == null) {
        unsetApplication();
      } else {
        setApplication((String)value);
      }
      break;

    case DATATYPE:
      if (value == null) {
        unsetDataType();
      } else {
        setDataType((String)value);
      }
      break;

    case TAGS:
      if (value == null) {
        unsetTags();
      } else {
        setTags((String)value);
      }
      break;

    case SEQID:
      if (value == null) {
        unsetSeqId();
      } else {
        setSeqId((Long)value);
      }
      break;

    case LOGEVENTS:
      if (value == null) {
        unsetLogEvents();
      } else {
        setLogEvents((List<String>)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SOURCE:
      return getSource();

    case STREAMNAME:
      return getStreamName();

    case APPLICATION:
      return getApplication();

    case DATATYPE:
      return getDataType();

    case TAGS:
      return getTags();

    case SEQID:
      return new Long(getSeqId());

    case LOGEVENTS:
      return getLogEvents();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case SOURCE:
      return isSetSource();
    case STREAMNAME:
      return isSetStreamName();
    case APPLICATION:
      return isSetApplication();
    case DATATYPE:
      return isSetDataType();
    case TAGS:
      return isSetTags();
    case SEQID:
      return isSetSeqId();
    case LOGEVENTS:
      return isSetLogEvents();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TChunk)
      return this.equals((TChunk)that);
    return false;
  }

  public boolean equals(TChunk that) {
    if (that == null)
      return false;

    boolean this_present_source = true && this.isSetSource();
    boolean that_present_source = true && that.isSetSource();
    if (this_present_source || that_present_source) {
      if (!(this_present_source && that_present_source))
        return false;
      if (!this.source.equals(that.source))
        return false;
    }

    boolean this_present_streamName = true && this.isSetStreamName();
    boolean that_present_streamName = true && that.isSetStreamName();
    if (this_present_streamName || that_present_streamName) {
      if (!(this_present_streamName && that_present_streamName))
        return false;
      if (!this.streamName.equals(that.streamName))
        return false;
    }

    boolean this_present_application = true && this.isSetApplication();
    boolean that_present_application = true && that.isSetApplication();
    if (this_present_application || that_present_application) {
      if (!(this_present_application && that_present_application))
        return false;
      if (!this.application.equals(that.application))
        return false;
    }

    boolean this_present_dataType = true && this.isSetDataType();
    boolean that_present_dataType = true && that.isSetDataType();
    if (this_present_dataType || that_present_dataType) {
      if (!(this_present_dataType && that_present_dataType))
        return false;
      if (!this.dataType.equals(that.dataType))
        return false;
    }

    boolean this_present_tags = true && this.isSetTags();
    boolean that_present_tags = true && that.isSetTags();
    if (this_present_tags || that_present_tags) {
      if (!(this_present_tags && that_present_tags))
        return false;
      if (!this.tags.equals(that.tags))
        return false;
    }

    boolean this_present_seqId = true;
    boolean that_present_seqId = true;
    if (this_present_seqId || that_present_seqId) {
      if (!(this_present_seqId && that_present_seqId))
        return false;
      if (this.seqId != that.seqId)
        return false;
    }

    boolean this_present_logEvents = true && this.isSetLogEvents();
    boolean that_present_logEvents = true && that.isSetLogEvents();
    if (this_present_logEvents || that_present_logEvents) {
      if (!(this_present_logEvents && that_present_logEvents))
        return false;
      if (!this.logEvents.equals(that.logEvents))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_source = true && (isSetSource());
    builder.append(present_source);
    if (present_source)
      builder.append(source);

    boolean present_streamName = true && (isSetStreamName());
    builder.append(present_streamName);
    if (present_streamName)
      builder.append(streamName);

    boolean present_application = true && (isSetApplication());
    builder.append(present_application);
    if (present_application)
      builder.append(application);

    boolean present_dataType = true && (isSetDataType());
    builder.append(present_dataType);
    if (present_dataType)
      builder.append(dataType);

    boolean present_tags = true && (isSetTags());
    builder.append(present_tags);
    if (present_tags)
      builder.append(tags);

    boolean present_seqId = true;
    builder.append(present_seqId);
    if (present_seqId)
      builder.append(seqId);

    boolean present_logEvents = true && (isSetLogEvents());
    builder.append(present_logEvents);
    if (present_logEvents)
      builder.append(logEvents);

    return builder.toHashCode();
  }

  public int compareTo(TChunk other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TChunk typedOther = (TChunk)other;

    lastComparison = Boolean.valueOf(isSetSource()).compareTo(isSetSource());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(source, typedOther.source);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetStreamName()).compareTo(isSetStreamName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(streamName, typedOther.streamName);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetApplication()).compareTo(isSetApplication());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(application, typedOther.application);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetDataType()).compareTo(isSetDataType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(dataType, typedOther.dataType);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetTags()).compareTo(isSetTags());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(tags, typedOther.tags);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetSeqId()).compareTo(isSetSeqId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(seqId, typedOther.seqId);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetLogEvents()).compareTo(isSetLogEvents());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(logEvents, typedOther.logEvents);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case SOURCE:
          if (field.type == TType.STRING) {
            this.source = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case STREAMNAME:
          if (field.type == TType.STRING) {
            this.streamName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case APPLICATION:
          if (field.type == TType.STRING) {
            this.application = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DATATYPE:
          if (field.type == TType.STRING) {
            this.dataType = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TAGS:
          if (field.type == TType.STRING) {
            this.tags = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SEQID:
          if (field.type == TType.I64) {
            this.seqId = iprot.readI64();
            setSeqIdIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case LOGEVENTS:
          if (field.type == TType.LIST) {
            {
              TList _list0 = iprot.readListBegin();
              this.logEvents = new ArrayList<String>(_list0.size);
              for (int _i1 = 0; _i1 < _list0.size; ++_i1)
              {
                String _elem2;
                _elem2 = iprot.readString();
                this.logEvents.add(_elem2);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.source != null) {
      oprot.writeFieldBegin(SOURCE_FIELD_DESC);
      oprot.writeString(this.source);
      oprot.writeFieldEnd();
    }
    if (this.streamName != null) {
      oprot.writeFieldBegin(STREAM_NAME_FIELD_DESC);
      oprot.writeString(this.streamName);
      oprot.writeFieldEnd();
    }
    if (this.application != null) {
      oprot.writeFieldBegin(APPLICATION_FIELD_DESC);
      oprot.writeString(this.application);
      oprot.writeFieldEnd();
    }
    if (this.dataType != null) {
      oprot.writeFieldBegin(DATA_TYPE_FIELD_DESC);
      oprot.writeString(this.dataType);
      oprot.writeFieldEnd();
    }
    if (this.tags != null) {
      oprot.writeFieldBegin(TAGS_FIELD_DESC);
      oprot.writeString(this.tags);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(SEQ_ID_FIELD_DESC);
    oprot.writeI64(this.seqId);
    oprot.writeFieldEnd();
    if (this.logEvents != null) {
      oprot.writeFieldBegin(LOG_EVENTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.logEvents.size()));
        for (String _iter3 : this.logEvents)
        {
          oprot.writeString(_iter3);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TChunk(");
    boolean first = true;

    sb.append("source:");
    if (this.source == null) {
      sb.append("null");
    } else {
      sb.append(this.source);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("streamName:");
    if (this.streamName == null) {
      sb.append("null");
    } else {
      sb.append(this.streamName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("application:");
    if (this.application == null) {
      sb.append("null");
    } else {
      sb.append(this.application);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dataType:");
    if (this.dataType == null) {
      sb.append("null");
    } else {
      sb.append(this.dataType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tags:");
    if (this.tags == null) {
      sb.append("null");
    } else {
      sb.append(this.tags);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("seqId:");
    sb.append(this.seqId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("logEvents:");
    if (this.logEvents == null) {
      sb.append("null");
    } else {
      sb.append(this.logEvents);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

