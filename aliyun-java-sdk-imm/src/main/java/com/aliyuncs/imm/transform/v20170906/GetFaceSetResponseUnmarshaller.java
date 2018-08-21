/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.GetFaceSetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFaceSetResponseUnmarshaller {

	public static GetFaceSetResponse unmarshall(GetFaceSetResponse getFaceSetResponse, UnmarshallerContext context) {
		
		getFaceSetResponse.setRequestId(context.stringValue("GetFaceSetResponse.RequestId"));
		getFaceSetResponse.setSetId(context.stringValue("GetFaceSetResponse.SetId"));
		getFaceSetResponse.setStatus(context.stringValue("GetFaceSetResponse.Status"));
		getFaceSetResponse.setPhotos(context.longValue("GetFaceSetResponse.Photos"));
		getFaceSetResponse.setCreateTime(context.stringValue("GetFaceSetResponse.CreateTime"));
		getFaceSetResponse.setModifyTime(context.stringValue("GetFaceSetResponse.ModifyTime"));
		getFaceSetResponse.setFaces(context.longValue("GetFaceSetResponse.Faces"));
	 
	 	return getFaceSetResponse;
	}
}