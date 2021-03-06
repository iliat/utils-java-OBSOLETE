// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/references.proto

package com.google.genomics.v1;

public final class ReferencesProto {
  private ReferencesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_Reference_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_genomics_v1_Reference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_ReferenceSet_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_genomics_v1_ReferenceSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_SearchReferenceSetsRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_genomics_v1_SearchReferenceSetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_SearchReferenceSetsResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_genomics_v1_SearchReferenceSetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_GetReferenceSetRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_genomics_v1_GetReferenceSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_SearchReferencesRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_genomics_v1_SearchReferencesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_SearchReferencesResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_genomics_v1_SearchReferencesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_GetReferenceRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_genomics_v1_GetReferenceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_ListBasesRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_genomics_v1_ListBasesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_ListBasesResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_genomics_v1_ListBasesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#google/genomics/v1/references.proto\022\022g" +
      "oogle.genomics.v1\032\034google/api/annotation" +
      "s.proto\"\220\001\n\tReference\022\n\n\002id\030\001 \001(\t\022\016\n\006len" +
      "gth\030\002 \001(\003\022\023\n\013md5checksum\030\003 \001(\t\022\014\n\004name\030\004" +
      " \001(\t\022\022\n\nsource_uri\030\005 \001(\t\022\031\n\021source_acces" +
      "sions\030\006 \003(\t\022\025\n\rncbi_taxon_id\030\007 \001(\005\"\266\001\n\014R" +
      "eferenceSet\022\n\n\002id\030\001 \001(\t\022\025\n\rreference_ids" +
      "\030\002 \003(\t\022\023\n\013md5checksum\030\003 \001(\t\022\025\n\rncbi_taxo" +
      "n_id\030\004 \001(\005\022\023\n\013description\030\005 \001(\t\022\023\n\013assem" +
      "bly_id\030\006 \001(\t\022\022\n\nsource_uri\030\007 \001(\t\022\031\n\021sour",
      "ce_accessions\030\010 \003(\t\"\202\001\n\032SearchReferenceS" +
      "etsRequest\022\024\n\014md5checksums\030\001 \003(\t\022\022\n\nacce" +
      "ssions\030\002 \003(\t\022\023\n\013assembly_id\030\003 \001(\t\022\022\n\npag" +
      "e_token\030\004 \001(\t\022\021\n\tpage_size\030\005 \001(\005\"p\n\033Sear" +
      "chReferenceSetsResponse\0228\n\016reference_set" +
      "s\030\001 \003(\0132 .google.genomics.v1.ReferenceSe" +
      "t\022\027\n\017next_page_token\030\002 \001(\t\"2\n\026GetReferen" +
      "ceSetRequest\022\030\n\020reference_set_id\030\001 \001(\t\"\204" +
      "\001\n\027SearchReferencesRequest\022\024\n\014md5checksu" +
      "ms\030\001 \003(\t\022\022\n\naccessions\030\002 \003(\t\022\030\n\020referenc",
      "e_set_id\030\003 \001(\t\022\022\n\npage_token\030\004 \001(\t\022\021\n\tpa" +
      "ge_size\030\005 \001(\005\"f\n\030SearchReferencesRespons" +
      "e\0221\n\nreferences\030\001 \003(\0132\035.google.genomics." +
      "v1.Reference\022\027\n\017next_page_token\030\002 \001(\t\"+\n" +
      "\023GetReferenceRequest\022\024\n\014reference_id\030\001 \001" +
      "(\t\"k\n\020ListBasesRequest\022\024\n\014reference_id\030\001" +
      " \001(\t\022\r\n\005start\030\002 \001(\003\022\013\n\003end\030\003 \001(\003\022\022\n\npage" +
      "_token\030\004 \001(\t\022\021\n\tpage_size\030\005 \001(\005\"N\n\021ListB" +
      "asesResponse\022\016\n\006offset\030\001 \001(\003\022\020\n\010sequence" +
      "\030\002 \001(\t\022\027\n\017next_page_token\030\003 \001(\t2\333\005\n\022Refe",
      "renceServiceV1\022\233\001\n\023SearchReferenceSets\022." +
      ".google.genomics.v1.SearchReferenceSetsR" +
      "equest\032/.google.genomics.v1.SearchRefere" +
      "nceSetsResponse\"#\202\323\344\223\002\035\"\030/v1/referencese" +
      "ts/search:\001*\022\215\001\n\017GetReferenceSet\022*.googl" +
      "e.genomics.v1.GetReferenceSetRequest\032 .g" +
      "oogle.genomics.v1.ReferenceSet\",\202\323\344\223\002&\022$" +
      "/v1/referencesets/{reference_set_id}\022\217\001\n" +
      "\020SearchReferences\022+.google.genomics.v1.S" +
      "earchReferencesRequest\032,.google.genomics",
      ".v1.SearchReferencesResponse\" \202\323\344\223\002\032\"\025/v" +
      "1/references/search:\001*\022}\n\014GetReference\022\'" +
      ".google.genomics.v1.GetReferenceRequest\032" +
      "\035.google.genomics.v1.Reference\"%\202\323\344\223\002\037\022\035" +
      "/v1/references/{reference_id}\022\205\001\n\tListBa" +
      "ses\022$.google.genomics.v1.ListBasesReques" +
      "t\032%.google.genomics.v1.ListBasesResponse" +
      "\"+\202\323\344\223\002%\022#/v1/references/{reference_id}/" +
      "basesB+\n\026com.google.genomics.v1B\017Referen" +
      "cesProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_genomics_v1_Reference_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_genomics_v1_Reference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_genomics_v1_Reference_descriptor,
        new java.lang.String[] { "Id", "Length", "Md5Checksum", "Name", "SourceUri", "SourceAccessions", "NcbiTaxonId", });
    internal_static_google_genomics_v1_ReferenceSet_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_genomics_v1_ReferenceSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_genomics_v1_ReferenceSet_descriptor,
        new java.lang.String[] { "Id", "ReferenceIds", "Md5Checksum", "NcbiTaxonId", "Description", "AssemblyId", "SourceUri", "SourceAccessions", });
    internal_static_google_genomics_v1_SearchReferenceSetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_genomics_v1_SearchReferenceSetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_genomics_v1_SearchReferenceSetsRequest_descriptor,
        new java.lang.String[] { "Md5Checksums", "Accessions", "AssemblyId", "PageToken", "PageSize", });
    internal_static_google_genomics_v1_SearchReferenceSetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_genomics_v1_SearchReferenceSetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_genomics_v1_SearchReferenceSetsResponse_descriptor,
        new java.lang.String[] { "ReferenceSets", "NextPageToken", });
    internal_static_google_genomics_v1_GetReferenceSetRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_genomics_v1_GetReferenceSetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_genomics_v1_GetReferenceSetRequest_descriptor,
        new java.lang.String[] { "ReferenceSetId", });
    internal_static_google_genomics_v1_SearchReferencesRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_genomics_v1_SearchReferencesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_genomics_v1_SearchReferencesRequest_descriptor,
        new java.lang.String[] { "Md5Checksums", "Accessions", "ReferenceSetId", "PageToken", "PageSize", });
    internal_static_google_genomics_v1_SearchReferencesResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_genomics_v1_SearchReferencesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_genomics_v1_SearchReferencesResponse_descriptor,
        new java.lang.String[] { "References", "NextPageToken", });
    internal_static_google_genomics_v1_GetReferenceRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_genomics_v1_GetReferenceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_genomics_v1_GetReferenceRequest_descriptor,
        new java.lang.String[] { "ReferenceId", });
    internal_static_google_genomics_v1_ListBasesRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_genomics_v1_ListBasesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_genomics_v1_ListBasesRequest_descriptor,
        new java.lang.String[] { "ReferenceId", "Start", "End", "PageToken", "PageSize", });
    internal_static_google_genomics_v1_ListBasesResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_genomics_v1_ListBasesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_genomics_v1_ListBasesResponse_descriptor,
        new java.lang.String[] { "Offset", "Sequence", "NextPageToken", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
