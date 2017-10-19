/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.gdal.osr;


public class osrJNI {
  public final static native void UseExceptions();
  public final static native void DontUseExceptions();

  private static boolean available = false;

  static {
    try {
      System.loadLibrary("osrjni");
      available = true;
    } catch (UnsatisfiedLinkError e) {
      available = false;
      System.err.println("Native library load failed.");
      System.err.println(e);
    }
  }
  
  public static boolean isAvailable() {
    return available;
  }

  public final static native String GetWellKnownGeogCSAsWKT__SWIG_0(String jarg1);
  public final static native String GetUserInputAsWKT__SWIG_0(String jarg1);
  public final static native int GetWellKnownGeogCSAsWKT__SWIG_1(String jarg1, String[] jarg2);
  public final static native int GetUserInputAsWKT__SWIG_1(String jarg1, String[] jarg2);
  public final static native java.util.Vector GetProjectionMethods();
  public final static native String[] GetProjectionMethodParameterList(String jarg1, String[] jarg2);
  public final static native void GetProjectionMethodParamInfo(String jarg1, String jarg2, String[] jarg3, String[] jarg4, double[] jarg5);
  public final static native long new_SpatialReference__SWIG_0(String jarg1);
  public final static native long new_SpatialReference__SWIG_1();
  public final static native void delete_SpatialReference(long jarg1);
  public final static native String SpatialReference___str__(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_IsSame(long jarg1, SpatialReference jarg1_, long jarg2, SpatialReference jarg2_);
  public final static native int SpatialReference_IsSameGeogCS(long jarg1, SpatialReference jarg1_, long jarg2, SpatialReference jarg2_);
  public final static native int SpatialReference_IsSameVertCS(long jarg1, SpatialReference jarg1_, long jarg2, SpatialReference jarg2_);
  public final static native int SpatialReference_IsGeographic(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_IsProjected(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_IsCompound(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_IsGeocentric(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_IsLocal(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_IsVertical(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_EPSGTreatsAsLatLong(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_EPSGTreatsAsNorthingEasting(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_SetAuthority(long jarg1, SpatialReference jarg1_, String jarg2, String jarg3, int jarg4);
  public final static native String SpatialReference_GetAttrValue__SWIG_0(long jarg1, SpatialReference jarg1_, String jarg2, int jarg3);
  public final static native String SpatialReference_GetAttrValue__SWIG_1(long jarg1, SpatialReference jarg1_, String jarg2);
  public final static native int SpatialReference_SetAttrValue(long jarg1, SpatialReference jarg1_, String jarg2, String jarg3);
  public final static native int SpatialReference_SetAngularUnits(long jarg1, SpatialReference jarg1_, String jarg2, double jarg3);
  public final static native double SpatialReference_GetAngularUnits(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_SetTargetLinearUnits(long jarg1, SpatialReference jarg1_, String jarg2, String jarg3, double jarg4);
  public final static native int SpatialReference_SetLinearUnits(long jarg1, SpatialReference jarg1_, String jarg2, double jarg3);
  public final static native int SpatialReference_SetLinearUnitsAndUpdateParameters(long jarg1, SpatialReference jarg1_, String jarg2, double jarg3);
  public final static native double SpatialReference_GetLinearUnits(long jarg1, SpatialReference jarg1_);
  public final static native String SpatialReference_GetLinearUnitsName(long jarg1, SpatialReference jarg1_);
  public final static native String SpatialReference_GetAuthorityCode(long jarg1, SpatialReference jarg1_, String jarg2);
  public final static native String SpatialReference_GetAuthorityName(long jarg1, SpatialReference jarg1_, String jarg2);
  public final static native int SpatialReference_SetUTM__SWIG_0(long jarg1, SpatialReference jarg1_, int jarg2, int jarg3);
  public final static native int SpatialReference_SetUTM__SWIG_1(long jarg1, SpatialReference jarg1_, int jarg2);
  public final static native int SpatialReference_GetUTMZone(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_SetStatePlane__SWIG_0(long jarg1, SpatialReference jarg1_, int jarg2, int jarg3, String jarg4, double jarg5);
  public final static native int SpatialReference_SetStatePlane__SWIG_1(long jarg1, SpatialReference jarg1_, int jarg2, int jarg3, String jarg4);
  public final static native int SpatialReference_SetStatePlane__SWIG_2(long jarg1, SpatialReference jarg1_, int jarg2, int jarg3);
  public final static native int SpatialReference_SetStatePlane__SWIG_3(long jarg1, SpatialReference jarg1_, int jarg2);
  public final static native int SpatialReference_AutoIdentifyEPSG(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_SetProjection(long jarg1, SpatialReference jarg1_, String jarg2);
  public final static native int SpatialReference_SetProjParm(long jarg1, SpatialReference jarg1_, String jarg2, double jarg3);
  public final static native double SpatialReference_GetProjParm__SWIG_0(long jarg1, SpatialReference jarg1_, String jarg2, double jarg3);
  public final static native double SpatialReference_GetProjParm__SWIG_1(long jarg1, SpatialReference jarg1_, String jarg2);
  public final static native int SpatialReference_SetNormProjParm(long jarg1, SpatialReference jarg1_, String jarg2, double jarg3);
  public final static native double SpatialReference_GetNormProjParm__SWIG_0(long jarg1, SpatialReference jarg1_, String jarg2, double jarg3);
  public final static native double SpatialReference_GetNormProjParm__SWIG_1(long jarg1, SpatialReference jarg1_, String jarg2);
  public final static native double SpatialReference_GetSemiMajor(long jarg1, SpatialReference jarg1_);
  public final static native double SpatialReference_GetSemiMinor(long jarg1, SpatialReference jarg1_);
  public final static native double SpatialReference_GetInvFlattening(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_SetACEA(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6, double jarg7);
  public final static native int SpatialReference_SetAE(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5);
  public final static native int SpatialReference_SetBonne(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5);
  public final static native int SpatialReference_SetCEA(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5);
  public final static native int SpatialReference_SetCS(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5);
  public final static native int SpatialReference_SetEC(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6, double jarg7);
  public final static native int SpatialReference_SetEckertIV(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4);
  public final static native int SpatialReference_SetEckertVI(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4);
  public final static native int SpatialReference_SetEquirectangular(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5);
  public final static native int SpatialReference_SetEquirectangular2(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6);
  public final static native int SpatialReference_SetGaussSchreiberTMercator(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6);
  public final static native int SpatialReference_SetGS(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4);
  public final static native int SpatialReference_SetGH(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4);
  public final static native int SpatialReference_SetIGH(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_SetGEOS(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5);
  public final static native int SpatialReference_SetGnomonic(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5);
  public final static native int SpatialReference_SetHOM(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6, double jarg7, double jarg8);
  public final static native int SpatialReference_SetHOM2PNO(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6, double jarg7, double jarg8, double jarg9);
  public final static native int SpatialReference_SetKrovak(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6, double jarg7, double jarg8);
  public final static native int SpatialReference_SetLAEA(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5);
  public final static native int SpatialReference_SetLCC(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6, double jarg7);
  public final static native int SpatialReference_SetLCC1SP(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6);
  public final static native int SpatialReference_SetLCCB(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6, double jarg7);
  public final static native int SpatialReference_SetMC(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5);
  public final static native int SpatialReference_SetMercator(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6);
  public final static native int SpatialReference_SetMollweide(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4);
  public final static native int SpatialReference_SetNZMG(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5);
  public final static native int SpatialReference_SetOS(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6);
  public final static native int SpatialReference_SetOrthographic(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5);
  public final static native int SpatialReference_SetPolyconic(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5);
  public final static native int SpatialReference_SetPS(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6);
  public final static native int SpatialReference_SetRobinson(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4);
  public final static native int SpatialReference_SetSinusoidal(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4);
  public final static native int SpatialReference_SetStereographic(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6);
  public final static native int SpatialReference_SetSOC(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5);
  public final static native int SpatialReference_SetTM(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6);
  public final static native int SpatialReference_SetTMVariant(long jarg1, SpatialReference jarg1_, String jarg2, double jarg3, double jarg4, double jarg5, double jarg6, double jarg7);
  public final static native int SpatialReference_SetTMG(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5);
  public final static native int SpatialReference_SetTMSO(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6);
  public final static native int SpatialReference_SetVDG(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4);
  public final static native int SpatialReference_SetWellKnownGeogCS(long jarg1, SpatialReference jarg1_, String jarg2);
  public final static native int SpatialReference_SetFromUserInput(long jarg1, SpatialReference jarg1_, String jarg2);
  public final static native int SpatialReference_CopyGeogCSFrom(long jarg1, SpatialReference jarg1_, long jarg2, SpatialReference jarg2_);
  public final static native int SpatialReference_SetTOWGS84(long jarg1, SpatialReference jarg1_, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6, double jarg7, double jarg8);
  public final static native int SpatialReference_GetTOWGS84(long jarg1, SpatialReference jarg1_, double[] jarg2);
  public final static native int SpatialReference_SetLocalCS(long jarg1, SpatialReference jarg1_, String jarg2);
  public final static native int SpatialReference_SetGeogCS__SWIG_0(long jarg1, SpatialReference jarg1_, String jarg2, String jarg3, String jarg4, double jarg5, double jarg6, String jarg7, double jarg8, String jarg9, double jarg10);
  public final static native int SpatialReference_SetGeogCS__SWIG_1(long jarg1, SpatialReference jarg1_, String jarg2, String jarg3, String jarg4, double jarg5, double jarg6, String jarg7, double jarg8, String jarg9);
  public final static native int SpatialReference_SetGeogCS__SWIG_2(long jarg1, SpatialReference jarg1_, String jarg2, String jarg3, String jarg4, double jarg5, double jarg6, String jarg7, double jarg8);
  public final static native int SpatialReference_SetGeogCS__SWIG_3(long jarg1, SpatialReference jarg1_, String jarg2, String jarg3, String jarg4, double jarg5, double jarg6, String jarg7);
  public final static native int SpatialReference_SetGeogCS__SWIG_4(long jarg1, SpatialReference jarg1_, String jarg2, String jarg3, String jarg4, double jarg5, double jarg6);
  public final static native int SpatialReference_SetProjCS__SWIG_0(long jarg1, SpatialReference jarg1_, String jarg2);
  public final static native int SpatialReference_SetProjCS__SWIG_1(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_SetGeocCS__SWIG_0(long jarg1, SpatialReference jarg1_, String jarg2);
  public final static native int SpatialReference_SetGeocCS__SWIG_1(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_SetVertCS__SWIG_0(long jarg1, SpatialReference jarg1_, String jarg2, String jarg3, int jarg4);
  public final static native int SpatialReference_SetVertCS__SWIG_1(long jarg1, SpatialReference jarg1_, String jarg2, String jarg3);
  public final static native int SpatialReference_SetVertCS__SWIG_2(long jarg1, SpatialReference jarg1_, String jarg2);
  public final static native int SpatialReference_SetVertCS__SWIG_3(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_SetCompoundCS(long jarg1, SpatialReference jarg1_, String jarg2, long jarg3, SpatialReference jarg3_, long jarg4, SpatialReference jarg4_);
  public final static native int SpatialReference_ImportFromWkt(long jarg1, SpatialReference jarg1_, String jarg2);
  public final static native int SpatialReference_ImportFromProj4(long jarg1, SpatialReference jarg1_, String jarg2);
  public final static native int SpatialReference_ImportFromUrl(long jarg1, SpatialReference jarg1_, String jarg2);
  public final static native int SpatialReference_ImportFromESRI(long jarg1, SpatialReference jarg1_, java.util.Vector jarg2);
  public final static native int SpatialReference_ImportFromEPSG(long jarg1, SpatialReference jarg1_, int jarg2);
  public final static native int SpatialReference_ImportFromEPSGA(long jarg1, SpatialReference jarg1_, int jarg2);
  public final static native int SpatialReference_ImportFromPCI__SWIG_0(long jarg1, SpatialReference jarg1_, String jarg2, String jarg3, double[] jarg4);
  public final static native int SpatialReference_ImportFromPCI__SWIG_1(long jarg1, SpatialReference jarg1_, String jarg2, String jarg3);
  public final static native int SpatialReference_ImportFromPCI__SWIG_2(long jarg1, SpatialReference jarg1_, String jarg2);
  public final static native int SpatialReference_ImportFromUSGS__SWIG_0(long jarg1, SpatialReference jarg1_, int jarg2, int jarg3, double[] jarg4, int jarg5);
  public final static native int SpatialReference_ImportFromUSGS__SWIG_1(long jarg1, SpatialReference jarg1_, int jarg2, int jarg3, double[] jarg4);
  public final static native int SpatialReference_ImportFromUSGS__SWIG_2(long jarg1, SpatialReference jarg1_, int jarg2, int jarg3);
  public final static native int SpatialReference_ImportFromUSGS__SWIG_3(long jarg1, SpatialReference jarg1_, int jarg2);
  public final static native int SpatialReference_ImportFromXML(long jarg1, SpatialReference jarg1_, String jarg2);
  public final static native int SpatialReference_ImportFromERM(long jarg1, SpatialReference jarg1_, String jarg2, String jarg3, String jarg4);
  public final static native int SpatialReference_ImportFromMICoordSys(long jarg1, SpatialReference jarg1_, String jarg2);
  public final static native int SpatialReference_ImportFromOzi(long jarg1, SpatialReference jarg1_, String jarg2, String jarg3, String jarg4);
  public final static native int SpatialReference_ExportToWkt(long jarg1, SpatialReference jarg1_, String[] jarg2);
  public final static native int SpatialReference_ExportToPrettyWkt__SWIG_0(long jarg1, SpatialReference jarg1_, String[] jarg2, int jarg3);
  public final static native int SpatialReference_ExportToPrettyWkt__SWIG_1(long jarg1, SpatialReference jarg1_, String[] jarg2);
  public final static native int SpatialReference_ExportToProj4(long jarg1, SpatialReference jarg1_, String[] jarg2);
  public final static native int SpatialReference_ExportToPCI(long jarg1, SpatialReference jarg1_, String[] jarg2, String[] jarg3, double[] jarg4);
  public final static native int SpatialReference_ExportToUSGS(long jarg1, SpatialReference jarg1_, int[] jarg2, int[] jarg3, double[] jarg4, int[] jarg5);
  public final static native int SpatialReference_ExportToXML__SWIG_0(long jarg1, SpatialReference jarg1_, String[] jarg2, String jarg3);
  public final static native int SpatialReference_ExportToXML__SWIG_1(long jarg1, SpatialReference jarg1_, String[] jarg2);
  public final static native int SpatialReference_ExportToMICoordSys(long jarg1, SpatialReference jarg1_, String[] jarg2);
  public final static native long SpatialReference_CloneGeogCS(long jarg1, SpatialReference jarg1_);
  public final static native long SpatialReference_Clone(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_Validate(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_StripCTParms(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_FixupOrdering(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_Fixup(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_MorphToESRI(long jarg1, SpatialReference jarg1_);
  public final static native int SpatialReference_MorphFromESRI(long jarg1, SpatialReference jarg1_);
  public final static native long new_CoordinateTransformation(long jarg1, SpatialReference jarg1_, long jarg2, SpatialReference jarg2_);
  public final static native void delete_CoordinateTransformation(long jarg1);
  public final static native void CoordinateTransformation_TransformPoint__SWIG_0(long jarg1, CoordinateTransformation jarg1_, double[] jarg2);
  public final static native void CoordinateTransformation_TransformPoint__SWIG_1(long jarg1, CoordinateTransformation jarg1_, double[] jarg2, double jarg3, double jarg4, double jarg5);
  public final static native void CoordinateTransformation_TransformPoint__SWIG_2(long jarg1, CoordinateTransformation jarg1_, double[] jarg2, double jarg3, double jarg4);
  public final static native void CoordinateTransformation_TransformPoints(long jarg1, CoordinateTransformation jarg1_, double[][] jarg2);
  public final static native long CreateCoordinateTransformation(long jarg1, SpatialReference jarg1_, long jarg2, SpatialReference jarg2_);
}
