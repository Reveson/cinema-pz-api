package com.example.cinema.cinemapz.dto;

public class ProjectionIdWithEpoch {

	private int projectionId;
	private long startTimeEpoch;

	public ProjectionIdWithEpoch() {}


	public ProjectionIdWithEpoch(int projectionId, long startTimeEpoch) {
		this.startTimeEpoch = startTimeEpoch;
		this.projectionId = projectionId;
	}

	public long getStartTimeEpoch() {
		return startTimeEpoch;
	}

	public void setStartTimeEpoch(long startTimeEpoch) {
		this.startTimeEpoch = startTimeEpoch;
	}

	public int getProjectionId() {
		return projectionId;
	}

	public void setProjectionId(int projectionId) {
		this.projectionId = projectionId;
	}

}
